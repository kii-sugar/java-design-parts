package Decorator;

public abstract class Border extends Display {
  protected Display display; // この飾り枠がくるんでいる中身（文字か、文字が内包された別の飾り枠）

  protected Border(Display display) {
    this.display = display;
  }
}
