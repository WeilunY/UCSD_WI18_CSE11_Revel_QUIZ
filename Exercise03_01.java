import java.util.Scanner;
public class Exercise03_01{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float a, b, c;
    float r1, r2;
    float disc;

    System.out.print("Enter a, b, c: ");
    a = input.nextFloat();
    b = input.nextFloat();
    c = input.nextFloat();

    disc = (float)Math.pow(b,2) - 4 * a * c;

    r1 = (float)(-b + Math.pow(disc, 0.5))/(float)(2 * a);
    r2 = (float)(-b - Math.pow(disc, 0.5))/(float)(2 * a);

    if (disc > 0)
    {
      System.out.println("The equation has two roots " + r1 + " and " + r2);
    }


    else if (disc == 0)
    {
      System.out.println("The equation has one root " + r1);
    }

    else
    {
      System.out.println("The equation has no real roots");
    }

  }
}
