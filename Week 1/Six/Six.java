// Design a program that allows a user to type in their age. The program should then work out which year they were born and output this to the screen.
package Six;

import java.time.LocalDate;
import java.util.Scanner;

public class Six {
  public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)) {
      System.out.println("Enter your age");
      String input = reader.nextLine();

      int age = Integer.parseInt(input);
      LocalDate currentDate = LocalDate.now();
      int currentYear = currentDate.getYear();
      int birthYear = currentYear - age;

      System.out.println("You were born in: " + birthYear);

    }
  }
}
