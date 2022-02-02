package Mediator;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
  // パーツの生成
  private ColleagueCheckbox checkGuest;
  private ColleagueCheckbox checkLogin;
  private ColleagueTextField textUser;
  private ColleagueTextField textPass;
  private ColleagueButton buttonOk;
  private ColleagueButton buttonCancel;

  // Colleagueたちを生成し、配置後に表示する
  public LoginFrame(String title) {
    super(title);

    // 背景色を設定する
    setBackground(Color.lightGray);

    // レイアウトマネージャを使って4X2のグリッドを作成する
    setLayout(new GridLayout(4, 2));

    // Colleagueたちを生成する
    createColleagues();

    // 配置する
    add(checkGuest);
    add(checkLogin);
    add(new Label("Username:"));
    add(textUser);
    add(new Label("Password:"));
    add(textPass);
    add(buttonOk);
    add(buttonCancel);

    // 有効無効の初期設定をする
    colleagueChanged(); // ゲストがtrueとして初期値設定されている状態で呼んでる

    // 表示する
    pack();
    setVisible(true);

  }
  @Override
  public void createColleagues() {
    // Checkbox
    CheckboxGroup g = new CheckboxGroup();
    checkGuest = new ColleagueCheckbox("Guest", g, true);
    checkLogin = new ColleagueCheckbox("Login", g, false);

    // テキストフィールド
    textUser = new ColleagueTextField("", 10);
    textPass = new ColleagueTextField("", 10);
    textPass.setEchoChar('*');

    // ボタン
    buttonOk = new ColleagueButton("OK");
    buttonCancel = new ColleagueButton("Cancel");

    // Mediatorを設定する
    checkGuest.setMediator(this);
    checkLogin.setMediator(this);
    textUser.setMediator(this);
    textPass.setMediator(this);
    buttonOk.setMediator(this);
    buttonCancel.setMediator(this);

    // Listenerのセット
    checkGuest.addItemListener(checkGuest);
    checkLogin.addItemListener(checkLogin);
    textUser.addTextListener(textUser);
    textPass.addTextListener(textPass);
    buttonOk.addActionListener(this);
    buttonCancel.addActionListener(this);
  }
  
  // Colleagueの状態が変化したときに呼ばれる
  @Override
  public void colleagueChanged() {
    // チェックボックスの状態を取得する
    if (checkGuest.getState()) {
      // ゲストログイン時
      textUser.setColleagueEnabled(false);
      textPass.setColleagueEnabled(false);
      buttonOk.setColleagueEnabled(true);
    } else {
      // ユーザーログイン時
      textUser.setColleagueEnabled(true);
      userPassChanged();
    }
  }

  // textUserまたはtextPassの変更があった
  // 各Colleagueの有効無効を判定する
  private void userPassChanged() {
    if(textUser.getText().length() > 0) {
      // ユーザ名入力があれば、パス欄有効化
      textPass.setColleagueEnabled(true);
      if (textUser.getText().length() > 3 && textPass.getText().length() > 3) {
        // かつ、パス欄入力あればボタン有効化
        buttonOk.setColleagueEnabled(true);
      } else {
        buttonOk.setColleagueEnabled(false);
      }
    } else {
      // ユーザ名ないのでパスもボタンも無効化
      textPass.setColleagueEnabled(false);
      buttonOk.setColleagueEnabled(false);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println(e.toString());
    System.exit(0);
  }
}
