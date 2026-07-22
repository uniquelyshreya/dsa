class Solution {
    public  int ceildiv(int[] nums, int div){
        int res=0;
        for(int i=0;i<nums.length;i++){
            res += (nums[i]+div-1)/div;
        }
        return res;
    }
    public int smallestDivisor(int[] nums, int threshold) {
    int maxi = nums[0];
    for(int i =0;i<nums.length;i++){
        if(nums[i]>maxi)
        maxi = nums[i];
    }
        int low = 1;int high = maxi; int ans=0;
        while(low<=high){
            int mid = (low+high)/2;
            if(ceildiv(nums,mid)<= threshold){
                ans = mid;
                high=  mid-1;
            }
            else low = mid+1;
        }

    
    return ans;
    }
}