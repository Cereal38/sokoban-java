import java.util.Scanner;

class Main {
  public static void main(String [] args) {
    Scanner scanner;
    String line = "";

    scanner = new Scanner(System.in);
    System.out.println("Write something:");
    
    try {
      line = scanner.nextLine();
    } catch (Exception e) {
      System.out.println("You wrote nothing!\nDetails: " + e);
    }
    System.out.println("You said: " + line);

    scanner.close();
  }
}