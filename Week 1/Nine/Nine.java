// Write a program that will calculate the how much interest will be paid on money invested in a savings account. The fixed interest rate is 1%. The user should enter the deposit amount and the program should display how much money the user will have after the interest is paid at the end of the year.
package Nine;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Nine {
  public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)) {
      System.out.println("Enter a monthly savings amount:");
      String input = reader.nextLine();
      double savings = Double.parseDouble(input);
      LocalDate currentDate = LocalDate.now();
      LocalDate december = LocalDate.of(currentDate.getYear(), 12, 1);
      Period period = Period.between(currentDate, december);
      int monthsBetween = period.getMonths();
      double totalSavings = 0;
      for (int i = 1; i <= monthsBetween; i++) {
        totalSavings = (totalSavings + savings) * 1.01;
      }
      String formattedSavings = String.format("%.2f", totalSavings);
      System.out
          .println("In December (" + monthsBetween + " months from now) the account value is $" + formattedSavings);

    }
  }
}
