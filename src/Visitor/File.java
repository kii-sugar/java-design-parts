package Visitor;

public class File extends Entry {
  private String name;
  private int size;

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    return size;
  }

  // インターフェースElementで定義したaccpetを同実装するかがポイント
  @Override
  public void accept(Visitor visitor) {
    // Visitorに対し、訪問先(この場合File)を教えている
    visitor.visit(this);
  }
}
