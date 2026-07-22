//package Linked_List;

import java.util.*;


    class Node{
        int data;
        Node next;
        Node back;
        Node(int data1, Node next1,Node back1){
             this.data = data1;
            this.next = next1;
            this.back = back1;
        }
        Node(int data1){
            this.data = data1;
            this.next = null;
            this.back = null;
        }

    }
    public class DLL{
        static Node arraytoDLL(int arr[]){
            Node head = new Node(arr[0]);
            Node prev = head;
            for(int i =1;i<arr.length;i++){
                Node temp = new Node(arr[i],null,prev);
                prev.next = temp;
                prev=temp;
            }
            return head;
        }
        static void print(Node head){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        static Node deletek(Node head,int k){
            if(head == null) return null;
            int cnt = 0;
            Node temp = head;
            while(temp.next!=null){
                cnt++;
                if(cnt==k) break;
                temp = temp.next;
            }
            Node prev = temp.back;
            Node front = temp.next;
            if(temp ==null && front==null){
                return null;
            }
            else if(front==null){
                prev.next = null;
                temp.back = null;
                return head;
            }
            prev.next = front;
            temp.back=null;
            front.back = prev;
            temp.next=null;
            return head;


            }
        
    public static void main(String[]args){
 int[] arr = {1,2,3,4,5};
Node head = arraytoDLL(arr);
Node head2 = deletek(head,5);
print(head2);
    }
}
