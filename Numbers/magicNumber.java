// A Magic Number is a number whose recursive sum of digits equals 1.
// Example: 28 → 2+8=10 → 1+0=1, so 28 is a magic number.

import java.util.Scanner;

public class magicNumber {
    public static int sumOfDigits(int n){
    int sum=0;
    while(n!=0){
      int d=n%10;
      sum+=d;
      n/=10;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=sumOfDigits(n);
    while(sum>9){
      sum=sumOfDigits(sum);
    }
    if(sum==1)
    System.out.println(n+ " is a magic number.");
    else
    System.out.println(n+ " is not a magic number.");
  }
}
