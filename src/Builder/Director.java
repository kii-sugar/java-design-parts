package Builder;

// Builderインターフェースを使用してインスタンスを作成する
// Builderのどんなサブクラスであってもうまく機能するように、Builderのメソッドのみを使用する
public class Director {
  private Builder builder;

  // Builder(抽象クラス)のサブクラスが渡されることになる
  // 抽象クラスはインスタンスを作れない
  public Director(Builder builder) {
    this.builder = builder;
  }

  // 文書を作るメソッド
  public void construct() {
    builder.makeTitle("Pokemon");
    builder.makeString("Typelist");
    builder.makeItems(new String[] {"water", "fire", "gost", "dragon"});
    builder.makeString("pokemonlist");
    builder.makeItems(new String[] {"messon", "hibani", "marumain","pikachu", "wanpachi"});
    builder.close();
  }
}