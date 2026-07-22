package stack;
import java.util.*;

public class stock_span {
    static ArrayList<Integer> calculateSpan(int[] arr){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] <=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(i+1);
                

            }
            else list.add(i-st.peek());
            st.push(i);
           
        }
         return list;
    }
    public static void main(String[] args){
       int[]  price = {100,80,65,70,60,75,85};
        ArrayList<Integer> sol = new ArrayList<>();
         sol = calculateSpan(price);
        for(int s : sol){
            System.out.println(s);
        }


    }
    
}
