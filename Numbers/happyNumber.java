// A Happy Number 1reaches 1 when repeatedly replaced by the sum of the squares of its digits.
// If it loops endlessly without reaching 1, it is not a happy number.

import java.util.Scanner;

public class happyNumber {
  
    public static int sumOfDigits(int n){
    int sum=0;
    while(n!=0){
      int d=n%10;
      sum+=d*d;
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
    System.out.println(n+ " is a happy number.");
    else
    System.out.println(n+ " is not a happy number.");
  }
}


