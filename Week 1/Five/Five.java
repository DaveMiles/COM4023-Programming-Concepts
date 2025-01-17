package Five;
// Write a program that allows the user to enter two integer values. The program should then output the original order they were entered, then output the values in reverse order (swapped).

import java.util.Scanner;

public class Five {
  public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)) {
      System.out.println("Enter two numbers separated by a space");
      String input = reader.nextLine();
      String[] numbers = input.split(" ");

      int firstNumber = Integer.parseInt(numbers[0]);
      int secondNumber = Integer.parseInt(numbers[1]);

      System.out.println("Original order: " + firstNumber + " " + secondNumber);
      System.out.println("Swapped order: " + secondNumber + " " + firstNumber);

    }
  }
}
