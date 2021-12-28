package Builder;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameBuilder implements Builder {

  private JFrame frame = new JFrame();
  private Box box = new Box(BoxLayout.Y_AXIS);

  @Override
  public void makeTitle(String title) {
    frame.setTitle(title);
  }

  @Override
  public void makeString(String string) {
    JLabel label = new JLabel(string);
    label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    box.add(label);
  }

  @Override
  public void makeItems(String[] items) {
    Box innerbox = new Box(BoxLayout.Y_AXIS);
    for (String item : items) {
      JButton button = new JButton(item);
      button.addActionListener(e -> {
        System.out.println(e.getActionCommand());
      });
      innerbox.add(button);
    }
    innerbox.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    box.add(innerbox);
  }

  @Override
  public void close() {
    frame.getContentPane().add(box);
    frame.pack();
    // 要修正
    /* frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    }); */

  }

  public JFrame getFrameResult() {
    return frame;
  }
  
}
