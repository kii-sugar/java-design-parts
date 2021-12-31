package Bridge;

import java.util.Random;

public class RandomDisplay extends CountDisplay {

  public RandomDisplay(DisplayImpl impl) {
    super(impl);
  }
  
  public void randomDisplay() {
    Random rand = new Random();
    int count = rand.nextInt(10) + 1;
    multiDisplay(count);
  }
}
