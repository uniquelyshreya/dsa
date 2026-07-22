import java.util.*;


    class Node{
        int data;
        Node next;
        Node(int data1, Node next1){
             this.data = data1;
            this.next = next1;
        }
        Node(int data1){
            this.data = data1;
            this.next = null;
        }

    }
  
    public class LL {
          public static   Node convertarr2ll(int[] arr){
       Node head = new Node(arr[0]);
       Node mover = head;
       for(int i=1;i<arr.length;i++){
        Node temp = new Node(arr[i]);
        mover.next = temp;
        mover = temp;
        
    }
    return head;
}
 static void print(Node head){
    Node temp = head;
    while(temp.next!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.print(temp.data);
}
static Node deletehead(Node head){
    //Node temp = head;
    head = head.next;
    return head;
}
static Node deleteK(Node head,int k){
    if(head==null) return null;
    int count=1;
    Node temp = head;
    Node prev = head;
    if(k==1){
        head = head.next;
        return head;
    }
    while(temp != null){
        
        if(count==k){
            prev.next = temp.next;
            break;
        }
        count++;
        prev = temp;
        temp = temp.next;
    }
    return head;
}
static Node insertAtPos(Node head,int el,int k){
    if(k==1){
        Node newnode = new Node(el,head);
        head = newnode;
        return head;
    }
    int count = 0;
    Node temp = head;
    while(temp!=null){
        count++;
        if(count==k-1){
            Node newnode = new Node(el,temp.next);
            temp.next = newnode;
        }
        temp = temp.next;
    
    }
    return head;
}
    public static void main(String[]args){
        int arr[] = {2,4,7,8};
        // Node y = new Node(arr[0],null);
        // System.out.println(y.data);
        Node head = convertarr2ll(arr);
      //  System.out.println(head.data);
       //print(head);
//  Node head2 = deletehead(head);
//  print(head2);
//Node head3 = deleteK(head,4);
Node head4 = insertAtPos(head,100,3);
print(head4); 



    }
    
}
