package Mediator;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/* TextListenerインターフェース：テキスト内容の変化をキャッチするために必要
 * 継承はひとつだけだけどインターフェースの実装ならいくつでも可能。
 */
public class ColleagueTextField extends TextField implements Colleague, TextListener {
  private Mediator mediator;

  public ColleagueTextField(String text, int columns) {
    super(text, columns);
  }

  // Mediatorを設定
  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  // Mediatorから有効無効が指示される
  @Override
  public void setColleagueEnabled(boolean enabled) {
    setEnabled(enabled);
    // 有効無効に合わせて背景色を変更する
    setBackground(enabled ? Color.white : Color.gray);
  }

  @Override
  public void textValueChanged(TextEvent e) {
    // 文字列が変化したらMediatorに通知する
    mediator.colleagueChanged();
  }
}
