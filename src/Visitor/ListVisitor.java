package Visitor;

// データ構造を渡り歩きながら一覧表示するためのクラス
public class ListVisitor extends Visitor {
  // 現在注目しているディレクトリ名
  private String currentdir = "";

  // File訪問時(Fileのacceptメソッド内で呼び出されるもの)
  // Fileクラスのインスタンスに対して行うべき処理を記述する
  @Override
  public void visit(File file) {
    System.out.println(currentdir + "/" + file);
  }

  // Directory訪問時(Directoryのacceptメソッド内で呼び出されるもの)
  // Directoryクラスのインスタンスに対して行うべき処理を記述する
  @Override
  public void visit(Directory directory) {
    System.out.println(currentdir + "/" + directory);
    String savedir = currentdir;
    currentdir = currentdir + "/" + directory.getName();
    for (Entry entry : directory) {
      // visitメソッドとacceptメソッドを互いに呼び出し合っている(複雑な再帰的メソッド呼び出し)
      // ダブルディスパッチ
      entry.accept(this);
    }
    currentdir = savedir;
  }
}
