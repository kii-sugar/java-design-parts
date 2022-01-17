package Strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {
  private Random random;
  private boolean won = false;
  private Hand prevHand;

  public WinningStrategy(int seed) {
    random = new Random(seed);
  }

  @Override
  public Hand nextHand() {
    // 前回勝ってたら同じ手だす。負けたor初回はランダム
    if (!won) {
      prevHand = Hand.getHand(random.nextInt(3));
    }
    return prevHand;
  }

  @Override
  public void study(boolean win) {
    won = win;
  }
}
