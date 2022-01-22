package Facade.pagemaker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// プロパティファイルをデータベースに見立てて管理
// Propertiesのインスタンスは作らず、getPropertiesのstaticメソッドを介してPropertiesインスタンスを得る
// pagemakerパッケージの外から利用できなくした。(public class => class)
class Database {
  private Database() {
  }
  // データベース名からPropertiesを得る
  public static Properties getProperties(String dbname) throws IOException {
    String filename = dbname + ".txt";
    Properties prop = new Properties();
    prop.load(new FileReader(filename));
    return prop;
  }
}
