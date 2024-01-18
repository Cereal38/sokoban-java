import java.io.File;

class Main {
  public static void main(String[] args) {

    File file = new File("levels/original.txt");
    LevelReader reader = new LevelReader(file);
    Level level;
    level = reader.readNextLevel();
    level = reader.readNextLevel();
    char[][] grid = level.grid();
    System.out.println("Level number " + level.name());
    for (int i = 0; i < level.rows(); i++) {
      System.out.println(grid[i]);
    }

  }
}