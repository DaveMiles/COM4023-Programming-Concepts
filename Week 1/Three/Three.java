package Three;
import java.util.Scanner;

class Three {
  public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)) {
      System.out.println("Enter rectangle Height");
      Integer height = Integer.parseInt(reader.nextLine());
      System.out.println("Enter rectangle Length");
      Integer length = Integer.parseInt(reader.nextLine());
      System.out.println("Rectangle perimeter is: " + (2 * (height + length)));
      System.out.println("Rectangle area is: " + (height * length));
    }
  }
}