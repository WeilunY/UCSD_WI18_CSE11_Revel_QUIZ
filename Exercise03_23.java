import java.util.Scanner;
public class Exercise03_23{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    final double width = 10.0/2, height = 5.0/2;
    double x, y;

    System.out.print("Enter a point with two coordinates: ");
    x = input.nextDouble();
    y = input.nextDouble();

    System.out.printf("Point (%f, %f) is ", x, y);

    if(Math.abs(x) < width && Math.abs(y) < height){
        System.out.println("in the rectangle");
    }
    else{
      System.out.println("not in the rectangle");
    }

  }
}
