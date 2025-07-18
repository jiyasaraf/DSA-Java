import java.util.Scanner;

public class perfectSquareNumber {

  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int sqrt=(int)Math.sqrt(n);
    if(sqrt*sqrt==n)  System.out.println(n+" is a perfect square number");
    else  System.out.println(n+" is not a perfect square number");
  }

}
