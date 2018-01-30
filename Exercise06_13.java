public class Exercise06_13{
  public static void main(String[] args){
    System.out.println("i m(i)");
    System.out.println("------");

    for (int i = 1; i <= 20; i++){
      System.out.println(i + " " + m(i));
    }
  }

  public static double m(int n){
    double result = 0.0;
    for (int i = 1; i <= n; i++){
      result += (double) i / (i +1);
    }
    return result;
  }
}
