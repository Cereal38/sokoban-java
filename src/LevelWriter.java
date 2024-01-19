import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class LevelWriter {

  private PrintStream printStream;

  public LevelWriter(File source) {
    try {
      this.printStream = new PrintStream(new FileOutputStream(source));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void writeLevel(Level level) {
    try {
      printStream.println("Hey");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void closeStream() {
    this.printStream.close();
  }
}
