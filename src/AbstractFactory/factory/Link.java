package AbstractFactory.factory;

// 抽象的な部品
// 抽象クラスItemを継承するがこのクラスも抽象クラス！
public abstract class Link extends Item {
  protected String url;
  
  public Link(String caption, String url) {
    super(caption);
    this.url = url;
  }
}
