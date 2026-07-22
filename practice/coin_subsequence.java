// tcs ques there are room with coins collect coins with exactly k amount
//choose the entry and exit room if you go to room you will have to collect coins


import java.util.*;
public class coin_subsequence {
    static int[] find_subsequence(int[] arr ,int k ){
        int left = 0 ;
       // int right = 0;
        int sum = 0;
       for(int right =0;right<arr.length;right++){
            sum += arr[right];
            while(sum > k){
                sum = sum - arr[left];
                left++;
            }
           // right++;
            if(sum==k) return new int[]{left+1,right+1};
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] arr = {5,3,7,14,18,1,18,4,3,8};
        int[] ans = find_subsequence(arr,23);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
