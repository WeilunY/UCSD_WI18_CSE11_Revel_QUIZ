import java.util.Scanner;

public class Exercise04_13{
  public static void main (String[] args){
    char letter;
    boolean isVowel = false;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    letter = input.next().charAt(0);
    input.close();

    switch(letter){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A' :
	      case 'E' :
	      case 'I' :
	      case 'O' :
	      case 'U' : isVowel = true;
    }
    if(isVowel){
      System.out.println(letter + " is a vowel");
    }
    else{
      if((letter >= 65 && letter <= 90) ||
      (letter >= 97 && letter <= 122)){
        System.out.println(letter + " is a consonant");
    } else {
      System.out.println(letter + " is a invalid input");
    }
    }
  }
}
