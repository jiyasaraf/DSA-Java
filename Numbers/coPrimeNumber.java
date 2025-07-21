// Two numbers are co-prime if their HCF is 1, i.e., no common factor except 1.  
// Example: (8, 15) → HCF = 1 → Co-prime.

import java.util.Scanner;

public class coPrimeNumber {
  public static int evaluateHCF(int x,int y){
    int num1,num2;
    if(x>y){
      num1=x;
      num2=y;
    }
    else{
      num1=y;
      num2=x;
    }
    int r=num1%num2;
    while(r>0){
      num1=num2;
      num2=r;
      r=num1%num2;
    }
    return num2;
  }
      public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int num1=sc.nextInt();
  int num2=sc.nextInt();
  if(evaluateHCF(num1,num2) ==1)  
    System.out.println("Co-Prime numbers");
  else 
    System.out.println("They are not Co-Prime.");
  }
}
