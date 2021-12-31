package Bridge;

public class CharDisplayImpl extends DisplayImpl {

  private char first;
  private char body;
  private char last;

  public CharDisplayImpl(char first, char body, char last) {
    this.first = first;
    this.body = body;
    this.last = last;
  }

  @Override
  void rawOpen() {
    System.out.print(first);  
  }

  @Override
  void rawPrint() {
    System.out.print(body);
  }

  @Override
  void rawClose() {
    System.out.println(last);
  }
}
