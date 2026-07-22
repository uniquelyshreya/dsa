import java.util.*;

public class postfix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        Stack<Integer> st = new Stack<>();
        char[] arr = exp.toCharArray();
        for(char ch : arr){
            if(Character.isDigit(ch)) st.push(ch-'0');
            else{
                int a = st.pop();
                int b = st.pop();
                switch(ch){
                    case '+' : st.push(b+a); break;
                    case '-' : st.push(b-a); break;
                    case '*' : st.push(b*a); break;
                    case '/'  : st.push(b/a); break;
                    default : System.out.println("Invalid string"); return;
                }
        }
    }
        System.out.println(st.pop());
    } 

    
}
