import java.util.Scanner;
public class Exercise06_07{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double amount = 0.0, rate = 0.0;

    System.out.print("The amount invested: ");
    amount = input.nextDouble();
    System.out.print("Annual interest rate: ");
    rate = input.nextDouble();

    input.close();

    for (int i = 1; i <= 30; i++){
      System.out.println(i + " " + futureInvestmentValue(amount, rate/1200, i));
    }
  }

  public static double futureInvestmentValue(double investmentAmount,
  double monthlyInterestRate, int years){
    return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

  }
}
