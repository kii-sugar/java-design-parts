package ChainOfResponsibility;

// トラブルを解決する連鎖を作るための抽象クラス
public abstract class Support {
  private String name; // このトラブル解決者の名前
  private Support next; // たらいまわしする先

  public Support(String name) {
    this.name = name;
    this.next = null;
  }

  // たらいまわしの先を設定する (?なぜnextを返すのか)
  // 連鎖の形成を一気に行えるようにするため
  // ex alice.setNext(bob).setNext(charlie).setNext(diana).setNext(Elmo)...
  public Support setNext(Support next) {
    this.next = next;
    return next;
  }

  // トラブル解決の手順を決める(TemplateMethod)
  public void support(Trouble trouble) {
    for (Support obj = this; true; obj = obj.next) {
      if (obj.resolve(trouble)) {
        obj.done(trouble);
        break;
      } else if (obj.next == null) {
        obj.fail(trouble);
        break;
      }
    }
  }

  // トラブル解決者の文字列表現
  @Override
  public String toString() {
    return "[" + name + "]";
  }

  // 解決しようとする (?なぜprotectedなのか)
  // ほかのクラスからトラブル快活する際には、resolveではなくsupportメソッドを使ってほしいという意図がある
  // publicになっていたら、resolveが呼べてしまい、期待しているのとは異なる使い方をされてしまう危険性があるため。
  protected abstract boolean resolve(Trouble trouble);

  // 解決したときの処理
  protected void done(Trouble trouble) {
    System.out.println(trouble + " is resolved by " + this + ".");
  }

  // 解決しなかったときの処理
  protected void fail(Trouble trouble) {
    System.out.println(trouble + " cannot be resolved.");
  }
}
