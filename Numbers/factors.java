import java.util.*;
class factors{
  public static List<Integer> factor(int n){
    List<Integer> ls=new ArrayList<>();
    int k=0;
    for(int i=1;i<=n;i++){
      if(n%i==0){
        ls.add(i);
      }
    }
    return ls;
  }

  public static void print(List<Integer> ans){
    for(int i:ans)
      System.out.print(i+" ");
  }

  public static void main(String[] args) {
    List<Integer> ans=new ArrayList<>();
    ans=factor(20);
    print(ans);
  }
}