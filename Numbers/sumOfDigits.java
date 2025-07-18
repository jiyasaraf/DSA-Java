import java.util.Scanner;
public class sumOfDigits {
  public static int sum(int n){
  int sum=0,d;
  while(n!=0){
    d=n%10;
    sum+=d;
    n/=10;
  }
  return sum;
}
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Sum of digits of "+ n + " is "+(sum(n)));
  }
}
