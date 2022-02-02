package Mediator;

public interface Mediator {
  
  // Colleague達を生成する
  public abstract void createColleagues();

  // Colleagueの状態が変化したときに呼ばれる（相談）
  public abstract void colleagueChanged();
}
