package ChainOfResponsibility;

// 発生したトラブルを表現するクラス。トラブル番号を持つ
public class Trouble {
  private int number; // トラブル番号

  // トラブルの生成
  public Trouble(int number) {
    this.number = number;
  }
  // トラブル番号を得る
  public int getNumber() {
    return number;
  }

  // トラブルの文字列表現
  @Override
  public String toString() {
    return "[Trouble " + number + "]";
  }
}
