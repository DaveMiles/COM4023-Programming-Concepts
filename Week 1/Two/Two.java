package Two;
import java.util.Scanner;  

class Two {
  public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)) {
      System.out.println("Enter username");

      String name = reader.nextLine(); 
      System.out.println("Hello, " + name);
    } 
  }
}