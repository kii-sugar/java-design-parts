package AbstractFactory.divfactory;

import AbstractFactory.factory.Item;
import AbstractFactory.factory.Tray;

public class DivTray extends Tray {
  public DivTray (String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    StringBuilder sb = new StringBuilder();
    sb.append("<p><b>");
    sb.append(caption);
    sb.append("</b></p>\n");
    sb.append("<div class=\"TRAY\">");
    for (Item item : super.getTray()) {
      sb.append(item.makeHTML());
    }
    sb.append("</div>");
    return sb.toString();
  } 
}