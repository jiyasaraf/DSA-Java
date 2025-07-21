// A Bouncy Number is neither strictly increasing nor strictly decreasing.  
// Example: 123 → increasing, 321 → decreasing, 132 → bouncy.

import java.util.Scanner;

public class bouncyNumber {

  public static int countSeq(int n){
    int inc=0,dec=0,temp=n%10;
    while(n!=0){
      int unit=n%10;
      if(unit>temp) dec++;
      if(unit<temp) inc++;
      temp=unit;
      n/=10;
    }
    return Math.max(inc,dec);
  }

  
  public static boolean isBouncy(int x){
    int digs=countDigits(x);
    int order=countSeq(x);
    if(order==digs-1)  
    return false;
    return true;
  }

  public static int countDigits(int n){
    return (int)Math.log10(n)+1;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(isBouncy(num)==true)
    System.out.println("It is a bouncy number.");
    else
    System.out.println("It is not a bouncy number.");
  }
}
