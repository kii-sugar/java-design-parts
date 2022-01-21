package ChainOfResponsibility;

// Supportクラスのサブクラス。常にfalseを返す、
public class NoSupport extends Support {
  public NoSupport(String name) {
    super(name);
  }

  @Override
  protected boolean resolve(Trouble trouble) {
    return false; // 自分では何も解決しない。必ずたらいまわしになる
  }
}
