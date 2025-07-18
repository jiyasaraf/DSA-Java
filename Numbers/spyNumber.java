// A Spy Number has equal sum and product of its digits.
// Example: 112 → sum = 1+1+2 = 4, product = 1×1×2 = 2 → not a spy number; 123 → sum = 6, product = 6.

import java.util.Scanner;

public class spyNumber {
public static int sum(int n){
  int sum=0;
  while(n!=0){
    int d=n%10;
    sum+=d;
    n/=10;
  }
  return sum;
}  
public static int product(int n){
  int prod=1;
  while(n!=0){
    int d=n%10;
    prod*=d;
    n/=10;
  }
  return prod;
}  
public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(sum(n)==product(n))
        System.out.println(n+" is a spy number.");
        else
        System.out.println(n+" is not a spy number.");
}
}
