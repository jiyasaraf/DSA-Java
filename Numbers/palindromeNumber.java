import java.util.*;
class palindromeNumber{
  public static boolean isPalindrome(int n){
    int s=0;
    int m=n;
    int d;
    while(n!=0){
      d=n%10;
      s=(s*10)+d;
      n/=10;
        }
        return s==m;
  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Is "+n+ " a palindrome number?");
    System.out.println(isPalindrome(n));
  }
}