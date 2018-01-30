import java.util.Scanner;
public class Divide{
  public static void main(String[] args){
    prompt();
  }

  public static void prompt(){
    int choice;
    double a, b, c, answer = 0.0;
    Scanner input = new Scanner(System.in);
    System.out.print("choose the number you want to divide (2 or 3): ");
    choice = input.nextInt();
    if(choice == 2){
      System.out.print("Please enter 2 numbers to divide: ");
      a = input.nextDouble();
      b = input.nextDouble();
      answer = divide2(a, b);
      System.out.println("The answer is " + answer);
    }
    else if (choice == 3){
      System.out.print("Please enter 3 numbers to divide: ");
      a = input.nextDouble();
      b = input.nextDouble();
      c = input.nextDouble();
      answer = divide3(a, b, c);
      System.out.println("The answer is " + answer);
    }
    else{
      System.out.println("Please enter the correct choice.");
      prompt();
    }
  }

  public static double divide2(double a, double b){
    return a / b;
  }

  public static double divide3(double a, double b, double c){
    double d = a / b;
    return d / c;
  }
}
