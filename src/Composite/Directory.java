package Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
  private String name;
  private List<Entry> directory = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    int size = 0;
    // ディレクトリ配下にあるのがディレクトリだろうがファイルだろうが再帰的にファイルの合計サイズが合計される
    for(Entry entry: directory) {
      size += entry.getSize();
    }
    return size;
  }

  @Override
  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this); // ディレクトリ名(サイズ)
    for (Entry entry: directory) {
      entry.printList(prefix + "/" + name); // ディレクトリ名/ファイル名(ファイルサイズ)
    }
  }

  // ディレクトリエントリをディレクトリに追加する
  public Entry add(Entry entry) {
    directory.add(entry);
    entry.setParent(this); // 親を設定する。(今追加したものを未来の親としている)
    return this;
  }
}
