package Singleton;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple2 {
  // 問題5-2 回答
  private static Map<String, Triple2> map = new HashMap<>();
  // static変数としてmapを持つ。
  static {
    String[] names = {"ALPHA", "BETA", "GAMMA"};
    // Arrays.stream(names)で作ったストリームをforEachメソッドに長し、nameそれぞれに対してインスタンス化する
    // map.put(new Triple2("ALPHA")); と3件分行っている
    Arrays.stream(names).forEach(name -> map.put(name, new Triple2(name)));
  }

  private String name;

  private Triple2(String name) {
    this.name = name;
  }


  public static Triple2 getInstance(String name) {
    // 該当するものが無い時はnullが返る
    return map.get(name);
  }

  @Override
  public String toString() {
    return this.name;
  }
}
