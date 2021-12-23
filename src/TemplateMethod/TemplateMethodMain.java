package TemplateMethod;

public class TemplateMethodMain {
  
  public void run() {
    AbstractDisplay d1 = new CharDisplay('N');

    AbstractDisplay d2 = new StringDisplay("Hello, World!!");

    d1.display();
    d2.display();
  }
}
