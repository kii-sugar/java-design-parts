package Singleton;

public class Triple {
  // 問題5-2 自分で考えた回答
  private static Triple alpha = new Triple("ALPHA");
  private static Triple beta = new Triple("BETA");
  private static Triple gamma = new Triple("GUMMA");
  private String name;

  private Triple(String name) {
    this.name = name;
  }

  public static Triple getInstance(String name) {
    switch (name) {
      case "ALPHA" :
        return alpha;
      case "BETA" :
        return beta;
      case "GUMMA" :
        return gamma;
      default :
        return null;
    }
  }

  public String getName() {
    return name;
  }
}
