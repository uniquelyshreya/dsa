package stack;
import java.util.*;
class minstack {
    Stack<Integer> st = new Stack<>();
    int minvalue;

    public minstack() {
        
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push(value);
            minvalue = value;
        }
     else if(value >=minvalue) st.push(value);
     else{
        st.push(2*value-minvalue);
        minvalue = value;
     } 
    }
    
    public void pop() {
     int temp = st.peek();
     st.pop();
     if(temp<minvalue)
    minvalue = 2*minvalue - temp;
        
    }
    
    public int top() {
     if(st.peek()<minvalue) return minvalue;
     else return st.peek();   
    }
    
    public int getMin() {
     return minvalue;   
    }

public static void main(String[] args){
    
 //*Your MinStack object will be instantiated and called as such:
  minstack obj = new minstack();
  obj.push(5);
  obj.pop();
  int param_3 = obj.top();
  int param_4 = obj.getMin();
  System.out.println(param_3 + param_4);
  obj.push(2);
  obj.push(9);
  obj.push(1);
  int min = obj.getMin();
   System.out.println(min);
  


 



}
}
