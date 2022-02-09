package Observer;

public class DigitObserver implements Observer {

  @Override
  public void update(NumberGenerator generator) {
    System.out.println("DigitObserver:" + generator.getNumber());
    try {
      // 表示の様子が分かるように遅くしている
      Thread.sleep(100);
    } catch (InterruptedException e) {
    }
  }
}
