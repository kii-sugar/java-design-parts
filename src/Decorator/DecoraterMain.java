package Decorator;

public class DecoraterMain {
  public void run() {
    Display b1 = new StringDisplay("Hello, world.");
    Display b = new UpDownBorder(b1, '-');
    Display b2 = new SideBorder(b1, '#');
    Display b3 = new FullBorder(b2);

    b1.show(); // 文字列だけ
    b.show();
    b2.show(); // 左右に#つけただけ
    b3.show(); // b2を含む上下左右に飾り枠

    Display b4 = new SideBorder(
        new FullBorder(
            new FullBorder(
                new SideBorder(
                    new FullBorder(new StringDisplay("good evening!")),
                    '$'))),
        '|');
    b4.show();
    
    MultiStringDisplay md = new MultiStringDisplay();
    md.add("byebye");
    md.add("stringstring");
    md.add("hi! my name is Naho.");
    md.show();

    Display d5 = new FullBorder(md);
    d5.show();
  }
}
