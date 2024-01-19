import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LevelReader {

  private Scanner scanner;

  public LevelReader(File source) {
    try {
      this.scanner = new Scanner(source);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public Level readNextLevel() {

    Level level = new Level();
    String line = "";
    int rowNumber = 0;
    int colNumber = 0;

    char[][] oversizedGrid = new char[100][100];

    try {
      boolean endReached = false;
      // Read file until the end or reaching a semicolon
      while (this.scanner.hasNextLine() && !endReached) {
        line = this.scanner.nextLine();
        // Reaching the comment
        if (line.toCharArray()[0] == ';') {
          // Set the name
          int semicolonIndex = line.indexOf(';');
          if (semicolonIndex != -1 && semicolonIndex < line.length() - 1) {
            String name = line.substring(semicolonIndex + 1).trim();
            level.setName(name);
          }
          endReached = true;
          // Ignore the empty line between levels
          if (this.scanner.hasNextLine()) {
            this.scanner.nextLine();
          }
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
          } else {
            // Write ' ' where there is nothing except the void
            correctGrid[row][col] = ' ';
          }
        }
      }
      level.setGrid(correctGrid);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return level;
  }
}
