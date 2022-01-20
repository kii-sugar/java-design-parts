package Visitor;

public interface Element {
  // Visitorパターンに適合させるためのインターフェース
   public abstract void accept(Visitor v);
}
