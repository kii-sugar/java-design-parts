package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCardFactory;
import FactoryMethod.television.TelevisionFactory;

public class FactoryMethodMain {
  public void run() {
    Factory factory = new IDCardFactory();
    Product idcard1 = factory.create("naho");
    Product idcard2 = factory.create("aki");
    Product idcard3 = factory.create("sayumi");
    idcard1.use();
    idcard2.use();
    idcard3.use();
    Factory televisionFactory = new TelevisionFactory();
    Product television1 = televisionFactory.create("panasonic");
    television1.use();

    Factory factory2 = new IDCardFactory();
    Product idcard4 = factory2.create("aaaaa");
    idcard4.use();
  }
}
