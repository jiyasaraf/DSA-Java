// Fibonacci Series is a sequence where each number is the sum of the two preceding ones.
// It starts from 0 and 1: 0, 1, 1, 2, 3, 5, 8, ...
import java.util.Scanner;

public class fibonacciSeries {
  public static int fibo(int n){
    if(n==0) return 0;
    else if(n==1) return 1;
    return fibo(n-1)+fibo(n-2);
  }

  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      System.out.print(fibo(i)+" ");
    }
  }
  
}
