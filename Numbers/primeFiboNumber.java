// A Prime Fibonacci Number is a Fibonacci number that is also prime.  
// Example: 2, 3, 5, 13, 89 are both Fibonacci and prime.

import java.util.*;
public class primeFiboNumber {
  public static boolean isFibo(int n){
    if(n<=1)  return true;
    int a=0,b=1;
    int c=a+b;
    while(c<=n){
      if(c==n)  return true;
      a=b;
      b=c;
      c=a+b;
    }
    return false;    
  }

  public static boolean isPrime(int x){
    if(x<=1)  return false;
    for(int i=2;i<x;i++)
    if(x%i==0)  return false;
    return true;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(isFibo(num) && isPrime(num))
    System.out.println("It is a prime fibo number.");
    else
    System.out.println("It is not a prime fibo number.");
  }

}
