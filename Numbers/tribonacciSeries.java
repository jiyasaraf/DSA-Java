// Tribonacci Series is similar to Fibonacci but sums the previous three numbers.
// It starts from 0, 1, 1: 0, 1, 1, 2, 4, 7, 13, ...

import java.util.Scanner;
public class tribonacciSeries {
  public static int tribo(int n){
    if(n==0) return 0;
    else if(n==1) return 1;
    else if(n==2) return 1;
    return tribo(n-1)+tribo(n-2)+tribo(n-3);
  }

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      System.out.print(tribo(i)+" ");
    }
  }
  
}
