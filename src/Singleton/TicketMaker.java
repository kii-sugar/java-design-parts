package Singleton;

public class TicketMaker {
  private int ticketNum = 1000;
  private static TicketMaker ticketMaker = new TicketMaker();

  private TicketMaker () {}

  public static TicketMaker getInstance() {
    return ticketMaker;
  }

  // マルチスレッド環境を考慮
  public synchronized int getTicketNum() {
    return ticketNum ++;
  }
}
