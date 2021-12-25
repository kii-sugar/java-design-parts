package FactoryMethod.idcard;

import FactoryMethod.framework.Product;

public class IDCard extends Product {
  private String owner;
  private int id;

  // アクセス修飾子なし⇒同じパッケージ内からのみアクセス可能
  // Main処理で、 IDCard cd = new IDCard("str"); が不可となり、必ずFactoryメソッド経由でないとインスタンス化できないようにできる
  IDCard(String owner, int id) {
    System.out.println(owner + "のカードを作成します。");
    this.owner = owner;
    this.id = id;
  }

  @Override
  public void use() {
    System.out.println(this + "のカードを使用します。"); 
  }

  // 参照値ではなく名前を返すため
  @Override
  public String toString() {
    return "[IDCard:" + owner + " ID:" + id + "]";
  }

  public String getOwner() {
    return owner;
  }

  public int getId() {
    return id;
  }
}