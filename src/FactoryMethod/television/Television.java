package FactoryMethod.television;

import FactoryMethod.framework.Product;

public class Television extends Product {

  private String name;
  
  Television(String name) {
    this.name = name;
  }

  @Override
  public void use() {
    System.out.println(name + "を使いました");
  }

  @Override
  public String toString() {
    return name;
  }

  public String getName() {
    return name;
  }
}
