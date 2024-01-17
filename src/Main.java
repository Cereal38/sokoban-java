import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;

class Main {
  public static void main(String [] args) {
    Scanner scanner;
    int input = 0;

    scanner = new Scanner(System.in);

    boolean validInt = false;
    while (!validInt) {
      System.out.println("Give a number: ");
      try {
        input = scanner.nextInt();
        validInt = true;
      } catch (InputMismatchException e) {
        System.out.println("This is not a number...");
        scanner.next();
      } catch (NoSuchElementException e) {
        System.out.println("You wrote nothing!");
        scanner.next();
      }
    }

    System.out.println("You said: " + input);

    scanner.close();
  }
}