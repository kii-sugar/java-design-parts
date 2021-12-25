package FactoryMethod.television;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;

// Factory側は、IDCardもTelevisionも何も知らないで良い。
// frameworkパッケージは、ほかパッケージに依存していない
public class TelevisionFactory extends Factory {

  @Override
  protected Product createProduct(String name) {
    return new Television(name);
  }

  @Override
  protected void registerProduct(Product product) {
    System.out.println(product.toString() + "を登録しました。");
  }
}
