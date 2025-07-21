// ISBN (International Standard Book Number) is a 10-digit number verified by a checksum rule.  
// Sum of (digit × position) % 11 should be 0 for a valid ISBN.

import java.util.*;
public class checkValidISBN {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String num=sc.next();
    int length=num.length();
    if(num.length()==10){
      long sum=0;
      long n=Long.parseLong(num);
      int c=1;
      while(n!=0){
        long temp=n%10;
        sum+=temp*c;
        c++;
        n/=10;
      }
      System.out.println(sum);
      if(sum%11==0) 
      System.out.println("It is a valid ISBN number");
      else
      System.out.println("It is not a valid ISBN number");
    }
    else
    System.out.println("Not a valid ISBN number due to size");
  }
}
