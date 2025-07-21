// Twin Primes are pairs of prime numbers that differ by 2.  
// Example: (11, 13), (17, 19), etc.

import java.util.Scanner;

public class twinPrimeNumber {
  
  public static boolean prime(int x){
    for(int i=2;i<x;i++)
      if(x%i==0)  return false;
      return true;
  }

    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int num1=sc.nextInt();
  int num2=sc.nextInt();
  if(prime(num1) && prime(num2) && Math.abs(num1-num2)==2)  
    System.out.println("A twin prime number");
  else 
    System.out.println("Not a twin prime number");
  }
}
