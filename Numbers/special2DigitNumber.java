// A Special Two-Digit Number is one where sum of its digits + their product = original number.  
// Example: 59 → 5+9 = 14, 5×9 = 45 → 14+45 = 59 → Special Number.

import java.util.Scanner;

public class special2DigitNumber {

  public static boolean digit(int n){
    if((int)Math.log10(n)+1 ==2)  return true;
    return false;
  }

  public static int sum(int n){
    int sum=0;
    while(n!=0){
      int unit=n%10;
      sum+=unit;
      n/=10;
    }
    return sum;
  }

  public static int product(int n){
    int prod=1;
    while(n!=0){
      int unit=n%10;
      prod*=unit;
      n/=10;
    }
    return prod;
  }

    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  if(product(n)+sum(n) == n && (digit(n))) 
  System.out.println(n+" is a special two-digit number");
  else 
  System.out.println(n+ " is not a special two-digit number");
  }

}
