
import java.util.*;
class asteroids_collision {
    public int[] Collision(int[] asteroids) {
      Stack<Integer> st = new Stack<>();
      //int i = 0;
     for(int i=0;i<asteroids.length;i++){
        int curr = asteroids[i];
        if(curr>0){
            st.push(curr);
        }
        else{
            
            while(!st.isEmpty() && st.peek() >0 && st.peek()<Math.abs(curr)){
                st.pop();
            }
            if(st.isEmpty() || st.peek()<0) st.push(curr);
            else if(st.peek()==Math.abs(curr)){
                st.pop();
            }
            else { } // current destroyed
        }
     }
    int[] res = new int[st.size()];
    for(int j =0;j<st.size();j++){
        res[j] = st.get(j);
        // Stack extends Vector so random access is possible
        // else you can traverse from right and store st.pop()
    }
    return res;
}
public static void main(String[] args){
    asteroids_collision a = new asteroids_collision();
    int[] arr = {5,10,-5};
    System.out.println(Arrays.toString(a.Collision(arr))); 

}
}