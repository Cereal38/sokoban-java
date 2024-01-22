public class Sequence {

  int tab[] = new int[10];
  int head = 0;
  int tail = 0;

  // Write and shift head right
  void insertHead(int value) {

    tab[head] = value;

    int nextHead = head == tab.length - 1 ? 0 : head + 1;

    if (nextHead == tail) {
      throw new RuntimeException("Sequence is full");
    } else {
      head = nextHead;
    }
  }

  // Shift tail left and write
  void insertTail(int value) {

    int nextTail = tail == 0 ? tab.length - 1 : tail - 1;

    if (nextTail == head) {
      throw new RuntimeException("Sequence is full");
    } else {
      tail = nextTail;
      tab[tail] = value;
    }
  }

  void printSequence() {
    int i = tail;
    while (i != head) {
      System.out.print(tab[i] + " ");
      i = i == tab.length - 1 ? 0 : i + 1;
    }
    System.out.println();
  }
}
