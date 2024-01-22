class Main {
  public static void main(String[] args) {

    // /* Load all level from the given file */
    // File fileIn = new File("levels/original.txt");
    // LevelReader reader = new LevelReader(fileIn);
    // LevelWriter writer = new LevelWriter(System.out);
    // Level level = reader.readNextLevel();

    // while (level != null) {
    // writer.writeLevel(level);
    // level = reader.readNextLevel();
    // }
    Sequence sequence = new Sequence();
    sequence.printSequence();
    sequence.insertHead(3);
    sequence.printSequence();
    sequence.insertHead(4);
    sequence.printSequence();
    sequence.insertHead(5);
    sequence.printSequence();
    sequence.insertTail(2);
    sequence.printSequence();
    sequence.insertTail(1);
    sequence.printSequence();
    sequence.insertHead(6);
    sequence.printSequence();
  }
}