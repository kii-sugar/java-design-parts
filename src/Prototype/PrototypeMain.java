package Prototype;

import Prototype.framework.Manager;
import Prototype.framework.Product;

public class PrototypeMain {
  public void run() {
    // 準備
    Manager manager = new Manager();
    UnderlinePen upen = new UnderlinePen('+');
    MessageBox mbox = new MessageBox('*');
    MessageBox sbox = new MessageBox('-');

    // 登録
    manager.register("plus message", upen);
    manager.register("asutarisuku", mbox);
    manager.register("minus box", sbox);

    // 生成と使用
    Product p1 = manager.create("plus message");
    p1.use("hello world!!!");

    Product p2 = manager.create("asutarisuku");
    p2.use("nyahonyahotamakurou");

    Product p3 = manager.create("minus box");
    p3.use("today is very nice day!");
  }
}
