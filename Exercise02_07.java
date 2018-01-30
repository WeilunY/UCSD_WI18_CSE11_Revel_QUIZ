import java.util.Scanner;
public class Exercise02_07{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    long minutes, remain;
    long year, day;

    System.out.print("Enter the number of minutes: ");

    minutes = input.nextLong();

    year = minutes / 525600;
    remain = minutes % 525600;

    day = remain / 1440;

    System.out.println(minutes + " minutes is approximately " +
    year + " years and " + day + " days");

  }
}
