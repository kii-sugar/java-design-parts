package Bridge;

import java.nio.file.Files;
import java.nio.file.Path;

public class TextDisplayImpl extends DisplayImpl {

  private String filename;

  public TextDisplayImpl(String filename) {
    this.filename = filename;
  }

  @Override
  void rawOpen() {
    System.out.println("=-=-=-=-=" + filename + "=-=-=-=-=");
  }

  @Override
  void rawPrint() {
    try {
      for (String line: Files.readAllLines(Path.of(filename))) {
        System.out.println("> " + line);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  void rawClose() {
    System.out.println("=-=-=-=-=" + filename + "=-=-=-=-=");
  }
}
