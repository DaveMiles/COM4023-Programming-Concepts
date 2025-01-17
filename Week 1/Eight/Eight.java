// Write a program that will convert the number of feet entered to miles. Note: there are 5280 feet to 1 mile.
package Eight;

import java.util.Scanner;

public class Eight {
  public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)) {
      System.out.println("Enter a number of feet to convert to miles");
      double feet = reader.nextDouble();

      double miles = feet / 5280.0;
      String formattedMiles = String.format("%.2f", miles);

      System.out.println("Distance in miles: " + formattedMiles);

    }
  }
}
