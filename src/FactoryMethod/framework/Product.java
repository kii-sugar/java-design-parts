package FactoryMethod.framework;

public abstract class Product {
  public abstract void use(); // 何はともあれ、使えるもの
  
  // public abstract Product(String str); は不可能、abstractなコンストラクタは作成不可
  // 名前必須にする場合は、下記のように名前を付けるメソッドを用意する
  // public abstract void setName(String str);
}
