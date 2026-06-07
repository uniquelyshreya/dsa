//package Strings;

class outermost_parentheses {
    public String removeOuterParentheses(String s) {
        int balance = 0;
        StringBuilder ans = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c=='('){
                if(balance > 0)  ans.append(c); 
                balance++;

            }
            if(c==')'){
                balance--;
                if(balance > 0)  ans.append(c);
            }
        }
        ans.toString(); // does nothing until strored or returned
       return ans.toString(); 
    }

 public static void main(String[] args){
    outermost_parentheses obj = new outermost_parentheses();
    String ans = obj.removeOuterParentheses("(())");
    System.out.println(ans);
 }
}
