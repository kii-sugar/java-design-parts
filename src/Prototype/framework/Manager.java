package Prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
  private Map<String, Product> showcase = new HashMap<>();


  public void register(String name, Product prototype) {
    // クラス名:インスタンスではなく、任意の名前:インスタンス
    // クラス名の束縛からフレームワークを分離している
    showcase.put(name, prototype);
  }

  public Product create(String protypeName) {
    Product p = showcase.get(protypeName); // 右辺は、Product実装したクラス
    // new するのではなく、コピーする
    return p.createCopy();
  }
}
