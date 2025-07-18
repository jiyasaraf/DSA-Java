// An Evil Number has an even number of 1s in its binary representation.
// Example: 9 → binary is 1001 → two 1s → Evil Number.

import java.util.Scanner;

public class evilNumber {
  public static int oneCount(int n){
    int count=0;
    while(n!=0){
    int temp=n%2;
      if(temp==1)  count++;
      n/=2;
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(oneCount(n)%2==0)  System.out.println(n+" is an evil number");
    else  System.out.println(n+" is not an evil number");
    }
}
