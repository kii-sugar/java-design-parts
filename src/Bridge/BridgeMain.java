package Bridge;

public class BridgeMain {
  
  public void run() {
    Display d1 = new Display(new StringDisplayImpl("hello world!"));
    Display d2 = new Display(new StringDisplayImpl("Have a nice day"));
    CountDisplay d3 = new CountDisplay(new StringDisplayImpl("count display"));
    Display d4 = new Display(new TextDisplayImpl("src/resources/sample.txt"));
    RandomDisplay d5 = new RandomDisplay(new StringDisplayImpl("str"));
    IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('*', '-', '*'), 1);
    d1.display();
    d2.display();
    d3.display();
    d3.multiDisplay(10);
    d4.display();
    d5.randomDisplay();
    d6.increaseDisplay(6);
  }
}
