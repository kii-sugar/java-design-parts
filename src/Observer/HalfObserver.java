package Observer;

public class HalfObserver implements Observer {
  @Override
  public void update(NumberGenerator generator) {
    System.out.println("HalfObserver:" + generator.getNumber() / 2);
  }
}
