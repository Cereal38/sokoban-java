import java.io.File;

class Main {
  public static void main(String[] args) {

    LevelReader reader = new LevelReader();
    Level level;
    File file = new File("levels/original.txt");
    level = reader.readNextLevel(file);
    char[][] grid = level.grid();
    for (int i = 0; i < level.rows(); i++) {
      System.out.println(grid[i]);
    }

  }
}