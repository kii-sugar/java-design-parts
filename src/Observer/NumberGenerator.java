package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
  // 保持しているObserverたち
  private List<Observer> observers = new ArrayList<>();

  // Observerを追加する
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  // Observerを削除する
  public void deleteObserver(Observer observer) {
    observers.remove(observer);
  }

  // Observerへ通知する
  // 「私の内容が更新されたのであなたの表示を更新してください」メソッド
  public void notifyObservers() {
    for(Observer o : observers) {
      o.update(this);
    }
  }

  // 数を取得する
  public abstract int getNumber();

  // 数を生成する
  public abstract void execute();
}
