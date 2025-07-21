// A Repunit Number has only the digit 1 repeated one or more times.  
// Example: 1, 11, 111, 1111 are repunit numbers.

import java.util.Scanner;

public class repunitNumber {
  public static boolean isRepunit(int num){
    while(num!=0){
      int unit=num%10;
      if(unit!=1) return false;
      num/=10;
    }
    return true;
  }  

  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int num=sc.nextInt();
  if(isRepunit(num))  
    System.out.println("A repunit number");
  else 
    System.out.println("Not a repunit number");
  }
}
