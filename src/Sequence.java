public class Sequence {

  int tab[] = new int[3];
  int head = 0;
  int tail = 0;

  void insertHead(int value) {
    tab[head] = value;

    int nexthead = head == tab.length - 1 ? 0 : head + 1;

    if (nexthead == tail) {
      throw new RuntimeException("Sequence is full");
    }

    head = nexthead;
  }

  void printSequence() {
    int i = tail;
    while (i != head) {
      System.out.println(tab[i]);
      i = i == tab.length - 1 ? 0 : i + 1;
    }
  }
}
