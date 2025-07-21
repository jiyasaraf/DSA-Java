// An Automorphic Number is a number whose square ends with the number itself.  
// Example: 76 → 76² = 5776 → ends with 76 → Automorphic.

import java.util.*;

public class automorphicNumber {
  public static int square(int n){
    return n*n;
  }  
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int digit=(int)Math.log10(n)+1;
  if((square(n))%((int)Math.pow(10,digit))==n)  System.out.println(n+" is an automorphic number");
  else System.out.println(n+ " is not an automorphic number");
  }
}
