// A Tech Number has even digits and when split in two halves, their sum squared equals the number.  
// Example: 2025 → 20 + 25 = 45 → 45² = 2025 → Tech Number.

import java.util.Scanner;

public class techNumber {
  public static int count(int x){
    return (int)Math.log10(x)+1;
  }

  public static int isTech(int x){
    
    int digits=count(x);
    if(digits%2!=0) return 0;
    int p=digits/2;
    int pow=(int)Math.pow(10,p);
    int first=x%pow;
    int second=x/pow;
    int ans=(int)Math.pow((first+second),2);
    return ans;
  }
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  if(isTech(num)==num)  
    System.out.println("A Tech number");
  else 
    System.out.println("Not a Tech number");
  }

}
