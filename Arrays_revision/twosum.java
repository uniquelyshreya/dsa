//package Arrays_revision;

import java.util.*;

public class twosum {
    static int[] find_2sum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int wanted = target - arr[i];
            if(map.containsKey(wanted)){
                int j = map.get(wanted);
                return new int[]{j,i};
            }
            else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int[] ans = new int[2];
    ans = find_2sum(arr,target);
    System.out.println(Arrays.toString(ans));
   } 
}
