package FactoryMethod.framework;

public abstract class Factory {
  public final Product create(String owner) {
    Product p = createProduct(owner);
    registerProduct(p);
    return p;
  }

  // new による実際のインスタン生成はサブクラスに任せることで
  // 具体的なクラス名による束縛からスーパークラスを開放している
  protected abstract Product createProduct(String owner);
  // ↑デフォルトで new Product();とする方法もある。
  protected abstract void registerProduct(Product product);
}