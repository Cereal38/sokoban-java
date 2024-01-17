import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LevelReader {

  public Level readNextLevel(File source) {

    Level level = new Level();
    String line = "";

    try (Scanner scanner = new Scanner(source)) {
      while (scanner.hasNextLine()) {
        line = scanner.nextLine();
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return level;
  }
}
