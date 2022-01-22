package Facade;

import Facade.pagemaker.PageMaker;

public class FacadeMain {
  public void run() {
    PageMaker.makeWelcomePage("naho@gmail.com", "welcome.html");
    PageMaker.makeLinkPage("linkpage.html");
  }
}
