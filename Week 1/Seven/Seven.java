// Now modify your solution to question 6, and instead ask the user to type in their date of birth. The program should then calculate how many days old they are (from today's date). Consider how you will store the components of the users date of birth (DOB) - which consists of day, month and year.
package Seven;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Seven {
  public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)) {
      System.out.println("Enter your date of birth in the format dd-mm-yyyy");
      String input = reader.nextLine();

      String[] dateOfBirth = input.split("-");

      int dayOfBirth = Integer.parseInt(dateOfBirth[0]);
      int monthOfBirth = Integer.parseInt(dateOfBirth[1]);
      int yearOfBirth = Integer.parseInt(dateOfBirth[2]);

      LocalDate dob = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
      LocalDate currentDate = LocalDate.now();
      Period period = Period.between(dob, currentDate);
      System.out.println("You are " + period.getYears() + " years, " + period.getMonths() + " months, and "
          + period.getDays() + " days old.");
    }
  }
}
