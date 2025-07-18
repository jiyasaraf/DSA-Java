// Jacobsthal Series is defined by J(n) = J(n-1) + 2 * J(n-2), starting from 0 and 1.
// Example: 0, 1, 1, 3, 5, 11, 21, ...

import java.util.Scanner;

public class jacobsthalSeries {

  public static int jacob(int n){
    if(n==0) return 0;
    else if(n==1) return 1;
    return jacob(n-1)+2*jacob(n-2);
  }

  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      System.out.print(jacob(i)+" ");
    }
  }
  
}


