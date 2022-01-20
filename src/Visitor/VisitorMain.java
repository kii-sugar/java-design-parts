package Visitor;

public class VisitorMain {
  public void run() {
    System.out.println("Making root entries...");
    Directory rootdir = new Directory("root");
    Directory bindir = new Directory("bin");
    Directory tmpdir = new Directory("tmp");
    Directory usrdir = new Directory("usr");

    rootdir.add(bindir);
    rootdir.add(tmpdir);
    rootdir.add(usrdir);
    bindir.add(new File("vi",10000));
    bindir.add(new File("latex", 20000));
    rootdir.accept(new ListVisitor());
    System.out.println();

    System.out.println("Making user entries...");
    Directory yuki = new Directory("yuki");
    Directory hanako = new Directory("hanako");
    Directory tomura = new Directory("tomura");
    usrdir.add(yuki);
    usrdir.add(hanako);
    usrdir.add(tomura);
    yuki.add(new File("diary.html",100));
    yuki.add(new File("Composite.java", 200));
    hanako.add(new File("memo.tex", 1000));
    tomura.add(new File("game.doc", 50));
    tomura.add(new File("junk.mail", 200));
    rootdir.accept(new ListVisitor());

    FileFindVisitor ffv = new FileFindVisitor(".html");
    rootdir.accept(ffv);
    System.out.println("HTML files are:");
    for(Entry file: ffv.getFoundFiles()) {
      System.out.println(file);
    }
  }
}
