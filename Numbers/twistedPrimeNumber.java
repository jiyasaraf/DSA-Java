// A Twisted Prime is a number that is prime and its reverse is also prime.  
// Example: 13 is prime and 31 is also prime → Twisted Prime.



import java.util.Scanner;

public class twistedPrimeNumber {
  
  public static boolean prime(int x){
    for(int i=2;i<x;i++)
      if(x%i==0)  return false;
      return true;
  }

  public static int reverse(int x){
    int rev=0;
    while(x!=0){
      int unit=x%10;
      rev=rev*10+unit;
      x/=10;
    }
    return rev;
  }


  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  if(prime(num) && prime(reverse(num)))  
    System.out.println("Twisted prime numbers.");
  else 
    System.out.println("They are not twisted prime.");
  }

}
