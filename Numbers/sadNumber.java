// A Happy Number 1reaches 1 when repeatedly replaced by the sum of the squares of its digits.
// If it loops endlessly without reaching 1, it is not a happy number.
// a number that is not happy, is a sad number

import java.util.Scanner;

public class sadNumber {
  
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
    int s=sumOfDigits(n);
    while(s>9){
      s=sumOfDigits(s);
    }
    if(s!=1)
    System.out.println(n+ " is a sad number.");
    else
    System.out.println(n+ " is not a sad number.");
  }
}



