// A Nelson Number is any number that is a multiple of 111.
// Example: 111, 222, 333, ..., all are Nelson numbers.

import java.util.Scanner;

public class nelsonNumber {
  public static boolean isDivBy11(int n){
    return n%111==0;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if((int)Math.log10(n)+1==3){
      if(isDivBy11(n))  System.out.println(n+" is a nelson number.");
      else  System.out.println(n+" is not a nelson number.");
    }
    else
    System.out.println(n+" is not a nelson number.");
  }
}
