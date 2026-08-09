//package day2;
// Given a sorted array:

// nums = [2, 7, 11, 15]
// target = 9

// Find the 1-based indices of two numbers whose sum equals target.

import java.util.Scanner;

public class two_sum2 {
  public static void main(String[] args){
   
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int left = 0;
    int right = n-1;
    while(left<right ){
        if(arr[left]+arr[right]==target) break;
        else if(arr[left]+arr[right]>target) right--;
        else left++;
    }
    System.out.print("indexes are  "+(left+1) + " "+ (right+1));
  }  
}
