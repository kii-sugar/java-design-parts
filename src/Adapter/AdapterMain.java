package Adapter;

import java.io.IOException;

public class AdapterMain {

  public void run() {

    // アダプターを使用せず直接Banner(Adapterr役)を呼び出した場合。
    Banner b = new Banner("string");
    b.showWithAster();
    b.showWithParen();
    
    // 継承 元となるもの(Banner)を知らなくてよい。
    Print p = new PrintBanner("aiueo");
    p.printStrong();
    p.printWeak();
    
    // 委譲
    Print2 p2 = new PrintBanner2("委譲");
    p2.printStrong2();
    p2.printWeak2();

    // Q.なぜこのようにPrintBannerに代入しないのか？
    PrintBanner2 why = new PrintBanner2("なぜ？");
    why.printStrong2();
    why.printWeak2();
    /* A. PrintBannerには抽象メソッドの実装以外のメソッドもある場合がある。
     * あくまでもインターフェース(Print)のメソッドを使用するのだというプログラマの意思表示になる
     */


    FileIO f = new FileProperties();
    try {
      f.readFromFile("./src/resources/file.txt");
      f.setValue("whith", "1024");
      f.setValue("height", "512");
      f.setValue("depth", "32");
      f.writeToFile("./src/resources/newfile.txt");
      System.out.println("newfile.txt is created.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
