import java.util.Scanner;

public class nivenNumber {
  public static int sumOfDigits(int n){
    int sum=0;
    while(n!=0){
      int d=n%10;
      sum+=d;
      n/=10;
    }
    return sum;
  }

  public static void isNiven(int n){
    if(n%sumOfDigits(n)==0)
    System.out.println(n+ " is a niven number.");
    else
    
    System.out.println(n+ " is not a niven number.");
  }
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    isNiven(n);
}
}
