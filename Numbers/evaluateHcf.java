// HCF is the largest number that divides two or more numbers exactly without a remainder.
// Also called GCD (Greatest Common Divisor).


import java.util.Scanner;

public class evaluateHcf {
  
  public static int findHCF(int num1, int num2){
    int x,y;
    if(num1>=num2){ x=num1; y=num2;}
    else{ x=num2; y=num1;}
    int r=x%y;
    while(r!=0){
      x=y;
      y=r;
      r=x%y;
    }
    return y;
  }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println("HCF of "+num1+" & "+num2+" is "+findHCF(num1,num2));
  }

}
