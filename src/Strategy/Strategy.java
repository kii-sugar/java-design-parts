package Strategy;

// じゃんけんの閃絡のための抽象メソッドを集めたもの
public interface Strategy {
  // 次に出す手を得るためのメソッド
  public abstract Hand nextHand();
  // さっき出した手によって勝ったかどうかを学習するためのメソッド
  // nextHandメソッドを呼び出して買った場合にはstudy(true)として呼び出す（次のnextHandの材料にするため)
  public abstract void study(boolean win);
}
