package AbstractFactory.listfactory;

import AbstractFactory.factory.Item;
import AbstractFactory.factory.Tray;

public class ListTray extends Tray {
  
  public ListTray (String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    StringBuilder sb = new StringBuilder();
    sb.append("<li>\n");
    sb.append(caption);
    sb.append("\n<ul>\n");
    // ここでItemのサブクラスを特定してはいけない。スーパークラスを指定できることがオブジェクト指向の良さ
    for(Item item: tray) {
      sb.append(item.makeHTML());
    }
    sb.append("</ul>\n");
    sb.append("</li>\n");
    return sb.toString();
  }
}
