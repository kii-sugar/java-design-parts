package Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry implements Iterable<Entry> {
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
    SizeVisitor v = new SizeVisitor();
    accept(v);
    return v.getSize();
  }

  public Entry add(Entry entry) {
    directory.add(entry);
    return this;
  }

  // ディレクトリエントリの一覧を得るためのIterator<Entry>を返す
  // これのおかげで拡張for文でList<Entry>から各Entryを取得できるようになっている
  @Override
  public Iterator<Entry> iterator() {
    return directory.iterator();
  }

  @Override
  public void accept(Visitor v) {
    // Visitorに訪問者(Directory)のことを教える
    v.visit(this);
  }
}
