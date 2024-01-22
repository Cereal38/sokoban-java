public class Sequence {

  int tab[] = new int[10];
  int start = 0;
  int end = 0;

  // Write and increase end
  void insertEnd(int value) {

    tab[end] = value;

    int nextEnd = end == tab.length - 1 ? 0 : end + 1;

    if (nextEnd == start) {
      throw new RuntimeException("Sequence is full");
    } else {
      end = nextEnd;
    }

  }

  // Write and shift head right
  void insertStart(int value) {

    int nextStart = start == 0 ? tab.length - 1 : start - 1;

    if (nextStart == end) {
      throw new RuntimeException("Sequence is full");
    } else {
      start = nextStart;
      tab[start] = value;
    }
  }

  void printSequence() {
    int i = start;
    while (i != end) {
      System.out.print(tab[i] + " ");
      i = i == tab.length - 1 ? 0 : i + 1;
    }
    System.out.println();
  }

  private void grow() {
  }
}
