import java.util.Scanner;

public class Exercise07_03{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] num = new int[100]; // 1 is 0; 100 is 99

    System.out.print("Enter the integers between 1 and 100: ");
    int n;
    do{
      n = input.nextInt();
      if(n >= 1 && n <= 100){
        num[n-1]++;
      }
    } while (n != 0);
    input.close();

    for(int i = 0; i < 100; i++){
      switch(num[i]){
        case 0:
          break;
        case 1:
          System.out.println((i + 1) + " occurs " + num[i]
          + " time" );
          break;
        default:
        System.out.println((i + 1) + " occurs " + num[i]
        + " times" );
      }
    }

  }
}
