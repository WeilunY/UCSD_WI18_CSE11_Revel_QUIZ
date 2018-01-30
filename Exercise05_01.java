import java.util.Scanner;
public class Exercise05_01{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int pos = 0, neg = 0, count = 0, total = 0;
    double average = 0.0;

    System.out.print("Enter an integer, the input end if it is 0: ");
    int n = input.nextInt();

    if (n == 0){
      System.out.println("No numbers are entered except 0");
    }
    else{
    while(n != 0){
      if(n > 0)
        pos++;
      if(n < 0)
        neg++;
      total +=  n;
      count++;
      n = input.nextInt();
    }

    input.close();

    average = (double)total / count;

    System.out.println("The number of positives is " + pos);
    System.out.println("The number of negatives is " + neg);
    System.out.println("The total is " + total);
    System.out.println("The average is " + average);
  }}
}
