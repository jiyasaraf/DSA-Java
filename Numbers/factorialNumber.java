// A Factorial Number is a number that is the factorial of an integer (n!).  
// Example: 120 = 5! → Factorial Number.

import java.util.Scanner;

public class factorialNumber {

  public static int fact(int n){
    if(n<=1)  return 1;
    return n*fact(n-1);
  }

  public static boolean isFactNo(int n){
    for(int i=2;i<=n;i++){
      if(fact(i)==n)  return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(isFactNo(num))
    System.out.println("It is a factorial number.");
    else
    System.out.println("It is not a factorial number.");
  }


}
