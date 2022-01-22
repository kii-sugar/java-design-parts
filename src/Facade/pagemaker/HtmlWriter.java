package Facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

// 簡単なWebページを作成するクラス
// 作成時にWriterを与えておき、そのWriterに対してHTMLを出力する
// このクラスには、titleメソッドを一番産所に呼ばなければならないという制約が隠れている
// 窓口となるPageMakerクラスにはその制約を守るように書かれている
class HtmlWriter {
  private Writer writer;

  public HtmlWriter(Writer writer) {
    this.writer = writer;
  }

  // タイトルの出力
  public void title(String title) throws IOException {
    writer.write("<!DOCTYPE html>");
    writer.write("<html>");
    writer.write("<head>");
    writer.write("<title>" + title + "</title>");
    writer.write("</head>");
    writer.write("<body>");
    writer.write("\n");
    writer.write("<h1>" + title + "</h1>");
    writer.write("\n");
  }

  // 段落の出力
  public void paragraph(String msg) throws IOException {
    writer.write("<p>" + msg + "</p>");
    writer.write("\n");
  }

  // リンクの出力
  public void link(String href, String caption) throws IOException {
    paragraph("<a href=\"" + href + "\">" + caption + "</a>");
  }

  // メールアドレスの出力
  public void mailto(String mailaddr, String username) throws IOException {
    link("mailto: " + mailaddr, username);
  }

  // 閉じる
  public void close() throws IOException {
    writer.write("</body>");
    writer.write("</html>");
    writer.write("\n");
    writer.close();
  }
}
