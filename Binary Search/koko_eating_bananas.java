class Solution {
    static int findmax(int[] piles){
        int maxi = piles[0];
        for(int p : piles){
            maxi = Math.max(p,maxi);
        }
        return maxi;
    }
    static long findhours(int[] piles,int speed){
        long total = 0;

        
        for(int p : piles){
            total += (p+speed-1)/speed;
            
        
        }
                return total;

    }
        
    
    public int minEatingSpeed(int[] piles, int h) {
        
           int maxi = findmax(piles);
           int low = 1; int high = maxi;
           int ans = Integer.MAX_VALUE;
           while(low<=high){
            int mid = low+(high-low)/2;
            long totalhrs = findhours(piles,mid);
            if(totalhrs<=h){
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
           }
           return ans;
    }
    
        