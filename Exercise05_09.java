import java.util.Scanner;
public class Exercise05_09{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of students: ");
    int total = input.nextInt();
    String name = "", top1_name = "", top2_name = "";
    double score = 0.0, top1_score = 0.0, top2_score = 0.0;

    for (int i = 0; i < total; i++){
      System.out.print("Enter a student name: ");
      name = input.next();
      System.out.print("Enter a student score: ");
      score = input.nextDouble();

      if(i == 0){
        top1_score = score;
        top1_name = name;
      }

      else if (i == 1 && score > top1_score){
        top2_score = top1_score;
        top2_name = top1_name;
        top1_score = score;
        top1_name = name;
      }

      else if (i == 1){
        top2_score = score;
        top2_name = name;
      }

      else if (i > 1 && score > top1_score && score > top2_score){
        top2_score = top1_score;
        top2_name = top1_name;
        top1_score = score;
        top1_name = name;
      }

      else if (i > 1 && score > top2_score){
        top2_score = score;
        top2_name = name;
      }
    }
    input.close();

    System.out.println("Top two students: ");
    System.out.println(top1_name +"'s score is " + top1_score);
    System.out.println(top2_name +"'s score is " + top2_score);
  }
}
