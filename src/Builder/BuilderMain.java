package Builder;

import javax.swing.JFrame;

public class BuilderMain {
  public void run(String[] args) {
    if (args.length != 1) {
      usage();
      System.exit(0);
    }
    if (args[0].equals("text")) {
      TextBuilder textbuilder = new TextBuilder();
      Director director = new Director(textbuilder);
      director.construct();
      String result = textbuilder.getTextResult();
      System.out.println(result);
    } else if (args[0].equals("html")) {
      HTMLBuilder htmlbuilder = new HTMLBuilder();
      Director director = new Director(htmlbuilder);
      director.construct();
      String filename = htmlbuilder.getHTMLResult();
      System.out.println("HTMLファイル名: " + filename + "が作成されました。");
    } else {
      usage();
      System.exit(0);
    }
  }

  public static void usage() {
    System.out.println("Usage: java main text            テキストで文書作成");
    System.out.println("Usage: java main html            HTMLファイルで文書作成");
  }

  public void runFrame() {
    FrameBuilder builder = new FrameBuilder();
    Director director = new Director(builder);
    director.construct();
    JFrame frame = builder.getFrameResult();
    frame.setVisible(true);
  }
}
