import java.util.Scanner;
public class Exercise12_07{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a binary number: ");
    String str = input.nextLine();
    try{
      System.out.println(bin2Dec(str));
    }catch(NumberFormatException ex){
      System.out.println("Not a binary number: " + str);
    }
  }

  public static int bin2Dec(String binaryString) throws NumberFormatException{
    int decimal = 0;
    for(int i = 0, j = binaryString.length()-1 ;
        i < binaryString.length(); i++, j--){
      if(binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
      {
        throw new NumberFormatException();
      }
      else{
        decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i))))
                    * Math.pow(2,j);
      }
    }
    return decimal;
  }
}
