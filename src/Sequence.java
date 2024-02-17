import java.util.Iterator;

public class Sequence<T> implements Iterable<T> {

  private Object[] tab = new Object[2];
  private int start = tab.length - 1;
  private int end = 0;

  // Write and increase end
  void insertEnd(T value) {

    tab[end] = value;

    int nextEnd = end == tab.length - 1 ? 0 : end + 1;
    end = nextEnd;

    if (nextEnd == start) {
      grow();
    }

  }

  // Write and decrease start
  void insertStart(T value) {

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
    Object[] newTab = new Object[tab.length * 2];
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
  public Iterator<T> iterator() {
    return new SequenceIterator();
  }

  private class SequenceIterator implements Iterator<T> {
    private int currentIndex = start == tab.length - 1 ? 0 : start + 1;

    @Override
    public boolean hasNext() {
      return currentIndex != end;
    }

    @Override
    public T next() {
      T value = (T) tab[currentIndex];
      currentIndex = currentIndex == tab.length - 1 ? 0 : currentIndex + 1;
      return value;
    }
  }
}
