class Solution {
public:
    int searchInsert(vector<int>& arr, int target) {
        //we have to calculate the lower bound 
        int n=arr.size();
        int low=0,high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low+high)/2;
            //if(arr[mid]==target) return mid; this is wrong
            if(arr[mid]>=target){
                high = mid-1;
                ans = mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
};