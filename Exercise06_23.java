import java.util.Scanner;
public class Exercise06_23{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = input.nextLine();

    System.out.print("Enter a character: ");
    char c = input.nextLine().charAt(0);

    input.close();

    System.out.println("The number of occurences of " + c + " in "
    + str + " is " + count(str,c) );
  }

  public static int count(String str, char c){
    int count = 0;
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == c){
        count++;
      }
    }
    return count;
  }
}
