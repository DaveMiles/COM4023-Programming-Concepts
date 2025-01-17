package Four;

import java.util.Scanner;

class Four {
  public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)) {
      System.out.println("Enter first Number");
      String inputOne = reader.nextLine();
      System.out.println("Enter second Number");
      String inputTwo = reader.nextLine();

      double num1 = Double.parseDouble(inputOne);
      double num2 = Double.parseDouble(inputTwo);

      double average = (num1 + num2) / 2;
      System.out.println("The average is: " + average);

    }
  }
}