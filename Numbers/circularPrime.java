// A Circular Prime remains prime through all rotations of its digits.  
// Example: 197 → 197, 971, 719 are all prime → Circular Prime.

import java.util.*;
public class circularPrime {
  public static boolean isPrime(int x){
    if(x<=1)  return false;
    for(int i=2;i<x;i++)
    if(x%i==0)  return false;
    return true;
  }

  public static boolean isCircPrime(int num){
    int c=countDigits(num);
    int div=(int)Math.pow(10,(c-1));
    int n=(num%div)*10+(num/div);
    while(n!=num){
      if(!(isPrime(n)))  return false;
      n=((n%div)*10)+(n/div);
    }

    return true;
  }


  public static int countDigits(int x){
    return (int)Math.log10(x)+1;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(isCircPrime(num))  
    System.out.println("It is a circular prime number.");
    else
    System.out.println("It is not a circular prime number.");
  }
}
