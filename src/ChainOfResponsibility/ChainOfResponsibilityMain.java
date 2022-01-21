package ChainOfResponsibility;

public class ChainOfResponsibilityMain {
  public void run() {

    Support alice = new NoSupport("Alice");
    Support bob = new LimitSupport("bob", 100);
    Support charlie = new SpecialSupport("charlie", 429);
    Support diana = new LimitSupport("Diana", 200);
    Support elmo = new OddSupport("Elmo");
    Support fred = new LimitSupport("Fred",300);

    // 連鎖の形成
    alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);

    // 様々なトラブル発生！誰が解決するのかな
    for (int i =0; i < 500; i +=23) {
      alice.support(new Trouble(i));
    }
  }
}
