package Binary Search;

class Solution {
    static int findmax(int[] bloomDay){
    int maxi = Integer.MIN_VALUE;
    for(int i =0;i<bloomDay.length;i++){
        if(bloomDay[i]>maxi) maxi = bloomDay[i];
         
    }
    return maxi;
    }
    static int findmin(int[] bloomDay){
    int mini = Integer.MAX_VALUE;
    for(int i =0;i<bloomDay.length;i++){
        
    if(bloomDay[i]<mini) mini = bloomDay[i]; 
    }
    return mini;

    }
    static boolean ispossible(int[] bloomDay,int k,int m,int mid){
        int count = 0; int bouquet = 0;
        for(int i =0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
               // bouquets += count/k;
            
            if(count==k){
                bouquet += count/k;
                count = 0;
            }
            }
         else count = 0;
        }
        if(bouquet>=m) return true;
        else return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
        int ans=-1;
       int maxi = findmax(bloomDay);
       int mini = findmin(bloomDay);
       int low = mini;
       int high = maxi;
       while(low<=high){
        int mid = low + (high-low)/2;
        if(ispossible(bloomDay,k,m,mid)){
            ans = mid;
            high = mid-1;
            
        }
        
        else low = mid+1;
       }
       return ans;
    }
}

