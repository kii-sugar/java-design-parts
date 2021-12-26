package Singleton;

public class SingletonMain {
  public void run() {
    System.out.println("start");

    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();
    if ( obj1 == obj2) {
      System.out.println("obj1とobj2は同一のインスタンスです");
    } else {
      System.out.println("obj1とobj2は別々のインスタンスです");
    }
    System.out.println("end");
    System.out.println();

    System.out.println("TicketMakerを呼び出します。");
    System.out.println(TicketMaker.getInstance().getTicketNum());
    System.out.println(TicketMaker.getInstance().getTicketNum());
    System.out.println(TicketMaker.getInstance().getTicketNum());

    System.out.println();
    Triple a1 = Triple.getInstance("ALPHA");
    Triple a2 = Triple.getInstance("ALPHsA");
    if (a1 == a2) {
      System.out.println("onaji");
    }
    Triple2 b1 = Triple2.getInstance("ALPHA");
    Triple2 b2 = Triple2.getInstance("BETssA");
    if (b1 == b2) {
      System.out.println("onaji");
    }
  }
}
