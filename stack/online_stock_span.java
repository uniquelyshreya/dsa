import java.util.Stack;
class StockSpanner {
    Stack<int[]>st  ;
    int ind;
    public StockSpanner() {
     st = new Stack<>(); 
     ind = -1  ;
    }
    
    public int next(int price) {
        ind++;
     while(!st.isEmpty() && st.peek()[1]<=price ){
        st.pop();
     }
     int pge = st.isEmpty()?-1:st.peek()[0];
     int span = ind -pge;
     st.push(new int[]{ind,price});
     return span;

    }
}

public class online_stock_span {
    

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
}
