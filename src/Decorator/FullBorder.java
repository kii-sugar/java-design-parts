package Decorator;

// 上下左右に飾りつけをする
// +------------+ 
// |stringstring|
// +------------+
public class FullBorder extends Border {
  public FullBorder(Display display) {
    super(display);
  }

  @Override
  public int getColumns() {
    // 文字数は中身の両端に左右の飾りも自分を加えたもの
    return 1 + display.getColumns() + 1;
  }

  @Override
  public int getRows() {
    // 行数は中身の行数に上下の飾り文字分を加えたもの
    return 1 + display.getRows() + 1;
  }

  @Override
  public String getRowText(int row) {
    if (row == 0 || row == display.getRows() + 1) { // 上下両端の枠
      return "+" + makeLine('-', display.getColumns()) + "+";
    } else {
      return "|" + display.getRowText(row - 1) + "|"; // それ以外
    }
  }

  // 文字chをcount個連続させた文字列を作る
  private String makeLine(char ch, int count) {
    StringBuilder line = new StringBuilder();
    for (int i = 0; i < count; i++) {
      line.append(ch);
    }
    return line.toString();
  }
}
