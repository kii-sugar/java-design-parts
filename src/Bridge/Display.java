package Bridge;

public class Display {
  private DisplayImpl impl;

  // 委譲：継承よりゆるやかな結びつき
  // これにより機能クラス改装と実装クラス改装を分けられる
  public Display (DisplayImpl impl) {
    this.impl = impl;
  }

  // たらいまわし
  public void open() {
    impl.rawOpen();
  }

  public void print() {
    impl.rawPrint();
  }

  public void close() {
    impl.rawClose();
  }

  public void display() {
    open();
    print();
    close();
  }
}