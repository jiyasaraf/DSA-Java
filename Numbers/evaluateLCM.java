// LCM is the smallest number that is a multiple of two or more numbers.
// It is useful to find common multiples in problems involving timing or repetition.


import java.util.Scanner;

public class evaluateLCM {
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
    int lcm=(num1*num2)/findHCF(num1,num2);
    System.out.println("LCM of "+num1+" & "+num2+" is "+lcm);
  }
}
