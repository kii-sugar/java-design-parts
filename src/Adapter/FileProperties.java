package Adapter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
  Properties properties = new Properties();

  @Override
  public void readFromFile(String filename) throws IOException {
    properties.load(new FileReader(filename));
    // java.io.Reader経由で読むことは分かる、 new Readerとしてハマった。12/22
    // どう考えたらFileReaderをnewするって分かるのか？
  }

  @Override
  public void writeToFile(String filename) throws IOException {
    properties.store(new FileWriter(filename), "comment");
  }

  @Override
  public void setValue(String key, String value) {
    properties.setProperty(key, value);
  }

  @Override
  public String getValue(String key) {
    return properties.getProperty(key);
  }
  
}
