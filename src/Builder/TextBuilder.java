package Builder;

public class TextBuilder implements Builder {

  private StringBuilder sb = new StringBuilder();
  @Override
  public void makeTitle(String title) {
    sb.append("================================\n");
    sb.append(title + "\n");
    sb.append("================================\n\n");
  }

  @Override
  public void makeString(String string) {
    sb.append("■");
    sb.append(string);
    sb.append("\n");
  }

  @Override
  public void makeItems(String[] items) {
    for (String item : items) {
      sb.append("  ・");
      sb.append(item);
      sb.append("\n");
    }
    sb.append("\n");
  }

  @Override
  public void close() {
    sb.append("================================\n");
  }
  
  public String getTextResult() {
    return sb.toString();
  }
}
