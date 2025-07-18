// A Special Number is a number equal to the sum of the factorials of its digits.
// Example: 145 = 1! + 4! + 5! = 145.

import java.util.Scanner;

public class specialNumber {

  public static int isSpecial(int n){
    int sum=0;
    while(n!=0){
      int d=n%10;
      sum+=fact(d);
      n/=10;
    }
    return sum;
  }

  public static int fact(int n){
    if(n<=1)  return 1;
    return n*fact(n-1);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=isSpecial(n);
    if(ans==n)
    System.out.println(n+ " is  a special number.");
    else
    System.out.println(n+ " is not a special number.");
  }
}
