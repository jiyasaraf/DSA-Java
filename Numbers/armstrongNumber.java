import java.util.Scanner;

public class armstrongNumber {
  
  public static boolean isArmstrong(int n){
  int sum=0,d;
  int m=n;
  int count=countDigits(n);
  while(n!=0){
    d=n%10;
    sum+=(int)Math.pow(d,count);
    n/=10;
  }
  return m==sum;
}

public static int countDigits(int n){
  return (int)Math.log10(n)+1;
}

  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Is "+n+" is an Arnstrong number? "+isArmstrong(n));
  }
}



