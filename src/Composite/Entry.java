package Composite;

public abstract class Entry {
  private Entry parent;

  // 親を設定する
  public void setParent(Entry entry) {
    this.parent = entry;
  }

  public abstract String getName(); // 名前を得る

  public abstract int getSize();

  // 一覧を表示する
  public void printList() {
    printList("");
  }

  // prefixを前につけて一覧表示する
  // protectedにすることによって、Entryのサブクラスでのみ使われるようになる
  protected abstract void printList(String prefix);

  // 文字列表現
  @Override
  public String toString() {
    return getName() + "(" + getSize() + ")";
  }

  // フルパスを得る
  public String getFullName() {
    StringBuilder fullName = new StringBuilder();
    Entry entry = this;
    do {
      fullName.insert(0, entry.getName());
      fullName.insert(0, "/");
      entry = entry.parent; // 最上位のディレクトリはnullになっている
    } while(entry != null);
    return fullName.toString();
  }
}