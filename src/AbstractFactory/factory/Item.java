package AbstractFactory.factory;

// LinkとTrayを同一視するためのクラス
public abstract class Item {
  protected String caption;

  public Item(String caption) {
    this.caption = caption;
  }

  // HTMLの文字列が戻り値となることを期待
  public abstract String makeHTML();
}
