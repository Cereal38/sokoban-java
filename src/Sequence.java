import java.util.Iterator;

public class Sequence implements Iterable<Integer> {

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

  void removeStart() {
    int nextStart = start == tab.length - 1 ? 0 : start + 1;
    if (nextStart != end) {
      start = nextStart;
    } else {
      throw new RuntimeException("Sequence is empty");
    }
  }

  void removeEnd() {
    int nextEnd = end == 0 ? tab.length - 1 : end - 1;
    if (nextEnd != start) {
      end = nextEnd;
    } else {
      throw new RuntimeException("Sequence is empty");
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

  @Override
  public Iterator<Integer> iterator() {
    return new SequenceIterator();
  }

  private class SequenceIterator implements Iterator<Integer> {
    private int currentIndex = start == tab.length - 1 ? 0 : start + 1;

    @Override
    public boolean hasNext() {
      return currentIndex != end;
    }

    @Override
    public Integer next() {
      int value = tab[currentIndex];
      currentIndex = currentIndex == tab.length - 1 ? 0 : currentIndex + 1;
      return value;
    }
  }
}
