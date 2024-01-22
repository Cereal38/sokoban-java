public class Sequence {

  int tab[] = new int[2];
  int start = tab.length - 1;
  int end = 0;

  // Write and increase end
  void insertEnd(int value) {

    tab[end] = value;

    int nextEnd = end == tab.length - 1 ? 0 : end + 1;
    end = nextEnd;

    if (nextEnd == start) {
      grow();
    }

  }

  // Write and decrease start
  void insertStart(int value) {

    tab[start] = value;

    int nextStart = start == 0 ? tab.length - 1 : start - 1;
    start = nextStart;

    if (nextStart == end) {
      grow();
    }
  }

  void printSequence() {
    System.out.print("Sequence: ");
    int i = start == tab.length - 1 ? 0 : start + 1;
    while (i != end) {
      System.out.print(tab[i] + " ");
      i = i == tab.length - 1 ? 0 : i + 1;
    }
    System.out.println();
  }

  private void grow() {
    int newTab[] = new int[tab.length * 2];
    // Copy from start to end at the beginning of the new array
    int i = start == tab.length - 1 ? 0 : start + 1;
    int j = 0;
    while (i != end) {
      newTab[j] = tab[i];
      i = i == tab.length - 1 ? 0 : i + 1;
      j++;
    }
    start = newTab.length - 1;
    end = j;
    tab = newTab;
  }
}
