import java.util.Scanner;
public class ArrayAverage{
  public static void main(String[] args){
    double[] nums = new double[100];
    double n, result;
    double sum = 0.0;
    int count = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter 100 numbers: ");
    for(int i = 0; i < 100; i++){
      n = input.nextDouble();
      nums[i] = n;
      sum += n;
    }

    result = sum / 100;
    System.out.println("The average is " + result);
    for(int i = 0; i < 100; i++){
      if (nums[i] >= result){
        count ++;
      }
  }
  System.out.println("There are " + count + " numbers above average");
}
}
