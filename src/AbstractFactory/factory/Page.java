package AbstractFactory.factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
  protected String title;
  protected String author;
  protected List<Item> content = new ArrayList<>();
  
  public Page(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public void add(Item item) {
    content.add(item);
  }

  public void output(String filename) {
    try {
      Files.writeString(
      Path.of(filename), // 書き込み対象のファイル
      makeHTML(), // 書き込む文字列
      StandardOpenOption.CREATE, // 存在しなかったら新たに作る
      StandardOpenOption.TRUNCATE_EXISTING, // 存在していたらいったん0にする
      StandardOpenOption.WRITE); // 書き込む
      System.out.println(filename + "を作成しました。");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public abstract String makeHTML();
}
