class Main {
  public static void main(String[] args) {

    Sequence<String> sequence = new Sequence();
    sequence.insertEnd("One");
    sequence.insertEnd("Three");
    sequence.removeEnd();
    sequence.insertEnd("Two");
    sequence.insertStart("Zero");
    sequence.insertEnd("Three");
    sequence.printSequence();

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