//package Heap;
import java.util.*;

public class kth_smallest {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();

       } 
       System.out.println("enter k");
       int k = sc.nextInt();
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for( int a : arr){
        pq.add(a);
        if(pq.size() > k){
            pq.poll();
        }
       }
       int[] ans = pq.toArray();
       
       for(int i=0;i<ans.length;i++){
        System.out.println(ans[i]);
       }
    }
    
}
