import java.util.Stack;
public class validParantheses {
  class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()%2!=0) return false;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            char ch2=ch[i];
            if(ch2=='('|| ch2== '{' || ch2=='[')
            st.push(ch2);
            else{
                if(st.isEmpty()) return false;
                char x=st.pop();
                if(x=='(' && ch2==')' || x== '{' && ch2=='}' || x=='[' && ch2==']')
                continue;
                return false;
            }
        }
        if(st.isEmpty())
        return true;
        return false;
    }
}
}
