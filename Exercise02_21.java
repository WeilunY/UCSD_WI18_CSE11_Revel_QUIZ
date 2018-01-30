import java.util.Scanner;
public class Exercise02_21{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double investment_amount, interest_rate;
    int year;
    double accumulated;

    System.out.print("Enter investment amount: ");
    investment_amount = input.nextDouble();

    System.out.print("Enter annual interest rate in percentage: ");
    interest_rate = input.nextDouble()/100.0;

    System.out.print("Enter number of years: ");
    year = input.nextInt();

    accumulated = investment_amount * Math.pow((1 + interest_rate/12), (year *12));

    System.out.printf("Accumulated value is $%.2f%n", accumulated);

  }
}
