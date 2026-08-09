import java.util.*;
 public class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}
class creation{
    public static void main(String[] args){
       Node root = new Node(5);
       root.left = new Node(3);
       root.right = new Node(2);
       root.left.left = new Node(4);
       root.left.right = new Node(1); 
    }
}