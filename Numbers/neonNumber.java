// A Neon Number is a number whose square's digits sum to the number itself.
// Example: 9 → 9² = 81 → 8+1 = 9 → Neon Number.

import java.util.Scanner;

public class neonNumber {

  public static int square(int n){
    return n*n;
  }

  public static int sumDigits(int n){
    int sum=0;
    while(n!=0){
      int temp=n%10;
      sum+=temp;
      n/=10;
    }
    return sum;
  }

  public static boolean isNeon(int n){
    int sq=square(n);
    int sum=sumDigits(sq);
    return sum==n;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(isNeon(n))
    System.out.println(n+" is a Neon Number.");
    else
    System.out.println(n+" is not a Neon Number");
  }

}
