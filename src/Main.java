class Main {
  public static void main(String[] args) {

    DemoFenetre Fenetre = new DemoFenetre();
    Fenetre.run();

    // /* Load all level from the given file */
    // File fileIn = new File("levels/original.txt");
    // LevelReader reader = new LevelReader(fileIn);
    // LevelWriter writer = new LevelWriter(System.out);
    // Level level = reader.readNextLevel();

    // while (level != null) {
    // writer.writeLevel(level);
    // level = reader.readNextLevel();
    // }
  }
}