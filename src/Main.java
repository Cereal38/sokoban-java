import java.io.File;

class Main {
  public static void main(String[] args) {

    LevelReader reader = new LevelReader();
    File file = new File("levels/original.txt");
    reader.readNextLevel(file);

  }
}