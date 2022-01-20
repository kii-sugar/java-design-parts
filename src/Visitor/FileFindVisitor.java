package Visitor;

import java.util.ArrayList;
import java.util.List;

public class FileFindVisitor extends Visitor {

  private String extension;
  private List<Entry> foundFiles = new ArrayList<>();

  public FileFindVisitor(String extension) {
    this.extension = extension;
  }

  public Iterable<Entry> getFoundFiles() {
    return foundFiles;
  }

  @Override
  public void visit(File file) {
    if(file.getName().endsWith(extension)){
      foundFiles.add(file);
    }
  }

  @Override
  public void visit(Directory directory) {
    for (Entry entry : directory) {
      entry.accept(this);
    }
  }
}
