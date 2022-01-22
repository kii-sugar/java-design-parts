package Facade.pagemaker;

import java.io.FileWriter;
import java.util.Properties;

// DatabaseクラスとHtmlWriterクラスを組み合わせて指定したユーザのWebページを作成する
// publicメソッドはmakeWelcomePageだけ
// ほかの尾ごちゃごちゃするところはこのクラスが一手に引き受けている
public class PageMaker {
  private PageMaker() {}

  public static void makeWelcomePage(String mailaddr, String filename) {
    try {
      // Database.getPropertiesはstatic
      Properties mailprop = Database.getProperties("src/Facade/maildata");
      String username = mailprop.getProperty(mailaddr); // メールアドレスに該当する名前を取得する
      HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
      writer.title(username + "'s Web Page.");
      writer.paragraph("Welcome to " + username + "'s web page!!");
      writer.paragraph("Nice to meet you.");
      writer.mailto(mailaddr, username);
      writer.close();

      System.out.println(filename + " is created for " + mailaddr + "(" + username + ")");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // maildata.txtに含まれているユーザのメールアドレスのリンク集を作成する
  public static void makeLinkPage(String filename) {
    try {
      Properties mailprop = Database.getProperties("src/Facade/maildata");
      HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
      writer.title("Link page");
      writer.paragraph("Link page");
      for (Object key : mailprop.keySet()) {
        String username = mailprop.getProperty(key.toString());
        writer.mailto(key.toString(), username);
      }
      writer.close();
      System.out.println(filename +" is created.");
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
