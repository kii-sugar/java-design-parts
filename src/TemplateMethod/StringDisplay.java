package TemplateMethod;

public class StringDisplay extends AbstractDisplay {

  private String str;
  private int width;

  //コンストラクタ
  public StringDisplay(String str) {
    this.str = str;
    this.width = str.length();
  }

  // openとcloseから呼び出されて+-----+と表示するメソッド
  private void printLine() {
    StringBuilder line = new StringBuilder();
    line.append("+");
    for (int i = 0; i < width; i++) {
      line.append("-");
    }
    line.append("+");
    System.out.println(line.toString());
  }

  @Override
  public void open() {
    printLine();
  }

  @Override
  public void print() {
    System.out.println("|" + str + "|");
  }

  @Override
  public void close() {
    printLine();
  }
}
