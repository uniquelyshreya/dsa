//package Arrays_revision;

import java.util.Scanner;

public class majority_element {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int count = 0;
    int ele = arr[0];
    for(int i=0;i<n;i++){
         if(count==0) ele = arr[i];
        if(arr[i]==ele) count++;
        else count--;
       
    }
    System.out.println(ele);
   } 
}
