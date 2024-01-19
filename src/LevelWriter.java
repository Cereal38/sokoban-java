import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class LevelWriter {

  private PrintStream printStream;

  // Constructor that takes a File
  public LevelWriter(File source) {
    try {
      this.printStream = new PrintStream(new FileOutputStream(source));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Constructor that takes a stream (Example: System.out)
  public LevelWriter(PrintStream stream) {
    this.printStream = stream;
  }

  public void writeLevel(Level level) {
    try {
      for (int i = 0; i < level.rows(); i++) {
        System.out.println(level.grid()[i]);
      }
      System.out.println("; " + level.name());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void closeStream() {
    this.printStream.close();
  }
}
