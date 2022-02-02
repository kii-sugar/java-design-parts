package Mediator;

public interface Colleague {
  
  // Mediatorを設定する。相談役を覚えておく
  public abstract void setMediator(Mediator mediator);

  // Mediatorから有効、無効が指示される
  // 自分が有効状態になるべきなのか否かの判断を受ける
  public abstract void setColleagueEnabled(boolean enabled);
}
