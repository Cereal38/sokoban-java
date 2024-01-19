import java.io.File;

class Main {
  public static void main(String[] args) {

    File file = new File("levels/original.txt");
    LevelReader reader = new LevelReader(file);
    Level level;
    level = reader.readNextLevel();
    level = reader.readNextLevel();

    LevelWriter levelWriter = new LevelWriter(System.out);
    levelWriter.writeLevel(level);

  }
}