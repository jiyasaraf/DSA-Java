import java.util.Scanner;

public class compositeNumber {
  
  public static boolean isPrime(int n){
    for(int i=2;i<n;i++)  if(n%i==0)  return false;
    return true;
  }
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean ans=isPrime(n);
    if(ans)
    System.out.println(n+ " is not a composite number.");
    else
    System.out.println(n+ " is  a composite number.");
  }
}




