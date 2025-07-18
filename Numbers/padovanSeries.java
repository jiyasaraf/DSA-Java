// Padovan Series is defined by P(n) = P(n-2) + P(n-3), with initial terms 1, 1, 1.
// Example: 1, 1, 1, 2, 2, 3, 4, 5, 7, ...

import java.util.Scanner;

public class padovanSeries {
  public static int padovan(int n){
    if(n==0) return 0;
    else if(n==1) return 1;
    else if(n==2) return 1;
    return padovan(n-2)+padovan(n-3);
  }

  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      System.out.print(padovan(i)+" ");
    }
  }
  
}


