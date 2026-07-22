//A thief is trying to escape from prison Problem

// A thief has to climb n walls.

// Height of each wall = arr[i]

// In one jump:

// climbs x units
// slips y units

// Find the total number of jumps required.
import java.util.*;

class thief_jumps{
    static int calculate_jump(int[] arr,int x,int y){
        int ans = 0;
        for(int a : arr){
            if(a<=x){
                ans = ans+1;
            }
            else{
                int eff = x-y;
                ans += ((a-x+eff-1)/eff) + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of walls");
        int a = sc.nextInt();
        System.out.println("enter heights of wall");
        int arr[] = new int[a];
        for(int i =0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter  jump length");
        int x = sc.nextInt();
        System.out.println("enter slip length");
        int y = sc.nextInt();
        System.out.println(calculate_jump(arr,x,y));
    }
}
