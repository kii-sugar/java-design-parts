package AbstractFactory.factory;

// 抽象的な部品
// 抽象クラスItemを継承するがこのクラスも抽象クラス！
public abstract class Link extends Item {
  protected String url;
  
  // コンストラクタは継承されないため、サブクラスでも定義する必要がある
  public Link(String caption, String url) {
    super(caption);
    this.url = url;
  }
}
