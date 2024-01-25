import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    System.out.println("Hi Ravens! Let's write some code!");
    System.out.print("Enter your x-coord: ");
    Scanner keyboard = new Scanner(System.in);
    double x = keyboard.nextDouble();
    System.out.print("Enter your y-coord: ");
    double y = keyboard.nextDouble();
    keyboard.close();

    System.out.print("This is in the " + MyStaticMethod.returnQ(x,y) + " quadrant");
  }
}
