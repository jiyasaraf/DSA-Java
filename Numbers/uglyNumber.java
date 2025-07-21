// An Ugly Number has only 2, 3, or 5 as its prime factors.  
// Example: 6, 8, 10 are ugly; 14 is not (has 7).


public class uglyNumber {
  public static boolean isUgly(int n){
    if(n<=0)  return false;
    else if(n<=5) return true;
    else{
      for(int i=2;i<6 && n>0; i++){
        while(n%i==0) n/=i;
      }
      if(n==1)
      return true;
      return false;
    }
  }
}
