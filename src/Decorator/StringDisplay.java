package Decorator;

// 1行の文字列を表示するクラス
public class StringDisplay extends Display {
  private String string;

  public StringDisplay(String string) {
    this.string = string;
  }

  @Override
  public int getColumns() {
    return string.length();
  }

  @Override
  public int getRows() {
    return 1;
  }

  // 0行目の時のみ、文字列を返す
  @Override
  public String getRowText(int row) {
    if (row != 0) {
      throw new IndexOutOfBoundsException();
    }
    return string;
  }
}
