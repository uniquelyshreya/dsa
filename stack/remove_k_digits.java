import java.util.*;

class remove_k_digits {
    public String removeKdigits(String num, int k) {
       Stack<Integer> st = new Stack<>();
       if(k==num.length()) return "0";

       for(int i=0;i<num.length();i++){
        while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)-'0'){
            st.pop();
            k--;
        }
        st.push(num.charAt(i)-'0');
       } 
        while(k>0){
        st.pop();
        k--;
       }
       StringBuilder temp = new StringBuilder();
     while(!st.isEmpty()){
        temp.append(st.pop());
       }
     temp.reverse();
    
        int i =0;    
        while(i<temp.length()&&temp.charAt(i)=='0') i++;
        if(i==temp.length()) return "0";
        return temp.substring(i,temp.length());


    }
}