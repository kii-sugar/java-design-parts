package TemplateMethod;

public abstract class AbstractDisplay {
  // open, print, closeはサブクラスに実装を任せる抽象メソッド
  protected abstract void open();
  protected abstract void print();
  protected abstract void close();

  // displayはAbstractDisplayで実装しているメソッド
  // finalの意：サブクラスでオーバーライドが出来ないことを表す。
  // クラス作成者の「displayメソッドをオーバーライドせずに機能拡張してね」の気持ち
  public final void display() {
    open();
    for (int i = 0; i < 5; i++) {
      print();
    }
    close();
  }
}