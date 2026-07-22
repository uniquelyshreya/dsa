//package Heap;
import java.util.*;
public class creation {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[] = {1,2,3,4,5};
    PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
    PriorityQueue<Integer> pqmax = new PriorityQueue<>(Collections.reverseOrder());
    for(int i =0;i<arr.length;i++){
        pq.offer(arr[i]);
        pqmax.offer(arr[i]);

    } 
    System.out.println(pq.peek() +" " + pqmax.peek());
    pq.poll();
    pqmax.poll();
     System.out.println(pq.peek() +" " + pqmax.peek());

  }  
}
