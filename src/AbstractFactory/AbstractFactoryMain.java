package AbstractFactory;

import AbstractFactory.factory.Factory;
import AbstractFactory.factory.Link;
import AbstractFactory.factory.Page;
import AbstractFactory.factory.Tray;

// 工場を使って部品を組み合わせ、製品を作る
/*このクラスでは一切具体的ンクラスを使用していない！
 * 具体的なクラス名は、コマンドラインの引数に指定する
 */
public class AbstractFactoryMain {
  public static void run(String[] args) {
    if (args.length !=2) {
      System.out.println(args[0]);
      usage();
    };

    String filename = args[0];
    String classname = args[1];

    // classnameの工場を作る。以降、factoryを使用して部品を生成する
    Factory factory = Factory.getFactory(classname); // staticで定義しているから呼べる

    // Blog
    Link blog1 = factory.createLink("Blog1", "https://example.com/blog1");
    Link blog2 = factory.createLink("Blog2", "https://example.com/blog2");
    Link blog3 = factory.createLink("Blog3", "https://example.com/blog3");

    Tray blogTray = factory.createtTray("Blog Site");
    blogTray.add(blog1);
    blogTray.add(blog2);
    blogTray.add(blog3);

    // News
    Link news1 = factory.createLink("news1", "https://news1");
    Link news2 = factory.createLink("news2", "https://news2");

    Tray newsTray = factory.createtTray("News Site");
    newsTray.add(news1);
    newsTray.add(news2);

    //　TrayもItemなので、TrayにTrayをaddすることも可能
    Link a1 = factory.createLink("item1", "https://item1");
    Link a2 = factory.createLink("item2", "https://item2");
    Link a3 = factory.createLink("item3", "https://item3");
    Tray aTray = factory.createtTray("aTray");
    aTray.add(a1);
    aTray.add(a2);
    aTray.add(a3);
    newsTray.add(aTray);

    // Page
    Page page = factory.createPage("Blog and News Page", "Naho Kizawa");
    page.add(blogTray);
    page.add(newsTray);

    page.output(filename);
  }

  public static void usage() {
    System.out.println("Usage: java Main filename.html class.name.of.Concretefactory");
    System.out.println("Example 1: java Main list.html listfactory.ListFactory");
    System.out.println("Example 2: java Main div.html divfactory.DivFactory");
    System.exit(0);
  }
}
