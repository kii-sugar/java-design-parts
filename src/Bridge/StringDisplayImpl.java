package Bridge;

public class StringDisplayImpl extends DisplayImpl {

  private String str;
  private int width;

  public StringDisplayImpl (String str) {
    this.str = str;
    this.width = str.length();
  }

  @Override
  void rawOpen() {
    printLine();
  }

  @Override
  void rawPrint() {
    System.out.println("|" + str + "|");
  }

  @Override
  void rawClose() {
    printLine();
  }

  private void printLine() {
    System.out.print("+");
    for (int i = 0; i < width; i++) {
      System.out.print("-");
    }
    System.out.println("+");
  }
}
