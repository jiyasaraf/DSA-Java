import java.util.Scanner;

public class uniqueNumber {
  public static boolean isUnique(int n){
    int[] hash=new int[10];
    while(n!=0){
      int d=n%10;
      if(hash[d]!=0)  return false;
      hash[d]++;
      n/=10;
    }
    return true;
  }

  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(isUnique(n))
    System.out.println(n+" is unique");
    else
    System.out.println(n+" is not unique");
  }
}
