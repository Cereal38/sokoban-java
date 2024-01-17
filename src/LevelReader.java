import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LevelReader {

  public Level readNextLevel(File source) {

    Level level = new Level();
    String line = "";
    int rowNumber = 0;
    int colNumber = 0;

    char[][] oversizedGrid = new char[100][100];

    try (Scanner scanner = new Scanner(source)) {

      boolean endReached = false;
      // Read file until the end or reaching a semicolon
      while (scanner.hasNextLine() && !endReached) {
        line = scanner.nextLine();
        // Reaching the comment
        if (line.toCharArray()[0] == ';') {
          endReached = true;
        } else {
          oversizedGrid[rowNumber] = line.toCharArray();
          if (line.length() > colNumber) {
            colNumber = line.length();
          }
          ++rowNumber;
        }
      }

      // Copy the temp array to the level grid and remove useless col or row
      char[][] correctGrid = new char[rowNumber][colNumber];
      for (int row = 0; row < rowNumber; row++) {
        for (int col = 0; col < colNumber; col++) {
          if (col < oversizedGrid[row].length) {
            correctGrid[row][col] = oversizedGrid[row][col];
          }
        }
      }
      level.setGrid(correctGrid);

      // TODO: Set the name

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return level;
  }
}
