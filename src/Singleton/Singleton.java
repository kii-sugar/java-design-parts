package Singleton;

public class Singleton {
  private static Singleton singleton = new Singleton();

  // コンストラクタはprivate:クラス外からの呼び出しを禁止するため。
  // クラス外からnewされても、エラーになる
  private Singleton() {
    System.out.println("インスタンスを生成しました");
  }

  // 唯一のインスタンスを得るメソッドとして、getIncetance(static FactoryMethodの一種)
  public static Singleton getInstance() {
    return singleton;
  }
}
