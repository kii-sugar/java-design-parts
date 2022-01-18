package Composite;

public class CompositeMain {
  public void run() {

    System.out.println("making root entries...");
    Directory rootdir = new Directory("root");
    Directory bindir = new Directory("bin");
    Directory tmpdir = new Directory("tmp");
    Directory usrdir = new Directory("usr");
    
    rootdir.add(bindir);
    rootdir.add(tmpdir);
    rootdir.add(usrdir);
    bindir.add(new File("vi", 10000));
    bindir.add(new File("latex", 200000));
    rootdir.printList();
    System.out.println("----------------------------");

    System.out.println("making user entries...");
    Directory yuki = new Directory("yuki");
    Directory hanako = new Directory("hanako");
    Directory tomura = new Directory("tomura");
    usrdir.add(yuki);
    usrdir.add(hanako);
    usrdir.add(tomura);
    File file = new File("diary.html", 200);
    yuki.add(file);
    yuki.add(new File("Composite.java", 300));
    hanako.add(new File("memo.tex", 1000));
    tomura.add(new File("game.doc", 50));
    tomura.add(new File("junk.mail", 200));
    rootdir.printList();
    System.out.println();

    System.out.println("file = " + file.getFullName());
    System.out.println("yuki = " + yuki.getFullName());
  }
}
