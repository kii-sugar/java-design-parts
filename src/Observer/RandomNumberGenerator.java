package Observer;

import java.util.Random;

// 乱数を生成する
public class RandomNumberGenerator extends NumberGenerator {
  private Random random = new Random(); // 乱数生成器
  private int number; // 現在の数

  // 数を取得する
  @Override
  public int getNumber() {
    return number;
  }

  // 数を生成する
  @Override
  public void execute() {
    for (int i = 0; i < 20; i++) {
      number = random.nextInt(50);
      // numberが変わったことをその都度観察者に通知する
      notifyObservers();
    }
  }
}
