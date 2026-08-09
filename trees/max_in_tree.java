package trees;
import java.util.*;
public class max_in_tree {
  //  int maxvalue = 0;
public int findmax(Node root){
    if(root==null){
        return Integer.MIN_VALUE;
    }
    
    
        return Math.max(root.data,Math.max(findmax(root.left),findmax(root.right)));
       
    }
}
    

