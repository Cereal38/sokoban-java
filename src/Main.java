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
    sequence.insertEnd(3);
    sequence.printSequence();
    sequence.insertEnd(4);
    sequence.printSequence();
    sequence.insertEnd(5);
    sequence.printSequence();
    sequence.insertStart(2);
    sequence.printSequence();
    sequence.insertStart(1);
    sequence.printSequence();
    sequence.insertEnd(6);
    sequence.printSequence();
    sequence.removeEnd();
    sequence.printSequence();
    sequence.removeEnd();
    sequence.printSequence();
    sequence.removeEnd();
    sequence.printSequence();
    sequence.removeStart();
    sequence.printSequence();
    sequence.removeStart();
    sequence.printSequence();
    sequence.removeStart();
    sequence.printSequence();
    sequence.removeStart();
    sequence.printSequence();
  }
}