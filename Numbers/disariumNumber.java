// A Disarium Number is a number where sum of digits powered to their position equals the number.  
// Example: 135 → 1¹ + 3² + 5³ = 135 → Disarium Number.

import java.util.Scanner;

public class disariumNumber {
  public static int isDisarium(int x){
    int sum=0;
    int count=(int)Math.log10(x)+1;
    while(x!=0){
      int unit=x%10;
      sum+=(int)Math.pow(unit,count);
      count--;
      x/=10;
    }
    return sum;
  }

      public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int num1=sc.nextInt();
  if(isDisarium(num1)==num1)  
    System.out.println("A Disarium number");
  else 
    System.out.println("Not a Disarium number");
  }

}
