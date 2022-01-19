package Decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
  private List<String> strings = new ArrayList<>();
  private int columns = 0; // 表示文字列の最大文字数

  public void add(String string) {
    strings.add(string);
    if (columns < string.length()) {
      columns = string.length();
    }
    updatePadding();
  }

  @Override
  public int getColumns() {
    return columns;
  }

  @Override
  public int getRows() {
    return strings.size();
  }

  @Override
  public String getRowText(int row) {
    return strings.get(row);
  }

  // それぞれの行を文字列+余白にする
  private void updatePadding() {
    for (int row = 0; row < strings.size(); row++) {
      String line = strings.get(row);
      int padding = columns - line.length();
      if (padding > 0) {
        strings.set(row, line + spaces(padding));
      }
    }
  }

  // count個の余白を作って返す
  private String spaces(int count) {
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < count; i++) {
      sb.append(' ');
    }
    return sb.toString();
  }
}
