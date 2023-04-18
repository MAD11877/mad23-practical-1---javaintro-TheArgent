import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */

    Scanner in = new Scanner(System.in);
    System.out.print("Input your Height in m: ");
    double height = in.nextDouble();
    System.out.print("Input your Weight in kg: ");
    double weight = in.nextDouble();
    System.out.println(String.format("Height: %.2f m", height));
    System.out.println(String.format("Weight: %.1f kg", weight));

    double bmi = weight/(height*height);
    System.out.println(String.format("Your BMI is %.1f",bmi));

  }
}
