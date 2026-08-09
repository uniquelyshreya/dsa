//package Arrays_revision;

import java.util.Scanner;

public class max_subarray_sum {
  public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int currsum = 0;
    int maxsum = currsum;
    for(int i=0;i<n;i++){
        currsum += arr[i];
        maxsum = Math.max(currsum,maxsum);
        if(currsum<0)
            currsum = 0;
    }
    System.out.print(maxsum);
  }  
}
