package Adapter;

public class PrintBanner2 extends Print2 {

  private Banner banner;

  public PrintBanner2 (String string) {
    this.banner = new Banner(string);
  }

  @Override
  public void printWeak2() {
    banner.showWithParen();
  }

  @Override
  public void printStrong2() {
    banner.showWithAster();
  }
}
