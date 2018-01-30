import java.util.Scanner;

public class Exercise09_13{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int r = 0, c = 0;

    System.out.print("Enter the number of rows and columns in the array: ");
    r = input.nextInt();
    c = input.nextInt();

    double[][] arr = new double[r][c];

    System.out.println("Enter the array: ");

    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        arr[i][j] = input.nextDouble();
      }
    }

    input.close();

    Location myLocation = locateLargest(arr);

    System.out.println("The location of the largest element is " +
    myLocation.getLargest() + " at " + myLocation.getLocation());

  }

  public static Location locateLargest(double[][] a){
    return new Location(a);
  }

}

class Location{
  int row = 0, column = 0;
  double maxValue = 0.0;

  Location(double[][] a){
    int r = 0, c = 0;
    double m = 0.0;

    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[i].length; j++ ){
        if(a[i][j] > m){
          m = a[i][j];
          r = i;
          c = j;
        }
      }
    }
    this.row = r;
    this.column = c;
    this.maxValue = m;
  }

  double getLargest(){
    return this.maxValue;
  }

  String getLocation(){
    return "(" + this.row + ", " + this.column + ")";
  }


}
