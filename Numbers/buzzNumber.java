import java.util.*;
class buzzNumber{
  public static boolean buzz(int n){
    return (n%10==7 || n%7==0);
  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Is "+n+ "a buzz number?");
    System.out.println(buzz(n));
  }
}