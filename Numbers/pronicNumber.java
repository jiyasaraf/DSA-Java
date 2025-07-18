// A Pronic Number is the product of two consecutive integers: n(n+1).
// Example: 6 = 2×3, 12 = 3×4.

import java.util.Scanner;



public class pronicNumber {
  
  public static boolean isPronic(int n){
  
        for(int i=1;i<n;i++)
        if(i*(i+1)==2*n)  return true;
        return false;
}
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=isPronic(n/2);
        if(ans)
          System.out.println(n+ " is a Pronic number.");
        else
          System.out.println(n+ " is  not a Pronic number.");
  }
}
