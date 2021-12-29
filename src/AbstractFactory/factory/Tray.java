package AbstractFactory.factory;

import java.util.ArrayList;
import java.util.List;

// 抽象的な部品
// 複数のLinkやTrayをあつめてひとまとまりにしたもの
// これも抽象クラス
public abstract class Tray extends Item {
  protected List<Item> tray = new ArrayList<>();

  // 子クラスでItemの実装を任せることによりここで実装しなくてよくなる
  public Tray(String caption) {
    super(caption);
  }

  public void add(Item item) {
    tray.add(item);
  }
}
