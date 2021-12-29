package AbstractFactory.listfactory;

import AbstractFactory.factory.Link;

public class ListLink extends Link {

  // Javaではコンストラクタは継承されないため、書く必要がある
  public ListLink(String caption, String url) {
    super(caption, url);
    // captionはItemクラスのプロパティ、urlはListクラスのプロパティ
  }

  @Override
  public String makeHTML() {
    return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
  }

}
