package FactoryMethod.idcard;
import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;

public class IDCardFactory extends Factory {

  private int id = 1;

  @Override
  protected synchronized Product createProduct(String owner) {
    Product idcard = new IDCard(owner, id);
    id ++;
    return idcard;
  }

  @Override
  protected void registerProduct(Product product) {
    System.out.println(product + "を登録しました");
  }
  
}
