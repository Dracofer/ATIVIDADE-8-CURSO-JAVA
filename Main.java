import java.util.Scanner;

public class Main {
  public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);

    double x;
    
    x = sc.nextDouble();

    if(x % 2 == 0){
      System.out.println("PAR");
    }else{
      System.out.println("IMPAR");
    }
    sc.close();
  }
}