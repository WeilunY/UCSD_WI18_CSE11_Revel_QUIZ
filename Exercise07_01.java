import java.util.Scanner;
public class Exercise07_01{
  public static void main(String[] args){
    int num = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of students: ");
    num = input.nextInt();

    int[] score = new int[num];
    char[] grade = new char[num];

    System.out.print("Enter " + num + " scores: ");

    int max = 0;
    for(int i = 0; i < num; i++){
      score[i] = input.nextInt();
      if(score[i] > max){
        max = score[i];
      }
    }
    
    input.close();

    for(int i = 0; i < num; i++){
      if(score[i] >= max - 10 )
        grade[i] = 'A';
      else if(score[i] >= max - 20)
        grade[i] = 'B';
      else if(score[i] >= max - 30)
        grade[i] = 'C';
      else if(score[i] >= max - 40)
        grade[i] = 'D';
      else
        grade[i] = 'F';

      System.out.println("Student " + i + " score is "
      + score[i] + " and grade is " + grade[i]);
    }

  }
}
