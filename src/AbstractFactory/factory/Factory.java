package AbstractFactory.factory;

// 抽象的な工場
public abstract class Factory {
  
  // クラス名を文字列として指定して、何の工場なのかを指定する
  public static Factory getFactory(String classname) {
    Factory factory = null;
    try {
      factory = (Factory)Class.forName(classname).getDeclaredConstructor().newInstance();
      /* Class.forName(String string) : そのクラスを動的に読み込む
       * getDeclaredConstructor(): コンストラクタを得る
       * newInstance():インスタンスを作る
       */
    } catch (Exception e) {
      e.printStackTrace();
    }
    return factory;
  }

  public Page createYahooPage() {
    Link link = createLink("Yahoo", "https://yahoo.com/");
    Tray tray = createtTray("Yahoo Site");
    tray.add(link);
    Page page = createPage("yahoo link page", "naho kizawa");
    page.add(tray);
    return page;

  }
  // 具体的な部品や製品の作成はサブクラスに任せる(subclass responsibility)
  public abstract Link createLink(String caption, String url);
  public abstract Tray createtTray(String caption);
  public abstract Page createPage(String title, String author);
}
