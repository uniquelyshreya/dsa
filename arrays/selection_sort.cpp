class Solution {
public:
// selectionSort means select the minimum and swap it with 1st element then 
//shift i++
    vector<int> selectionSort(vector<int>& nums) {
        int n = nums.size();
        for(int i=0;i<n-1;i++)//at the end last elemnt is already sorted
        {
           int minm = i; // min is already there in c++ stl
            for(int j=i+1;j<n;j++)
            {
                if(nums[minm]>nums[j]){
                    minm = j;
                }
            }
            int temp = nums[minm];
            nums[minm]=nums[i];
            nums[i]=temp; // swap 1st elment (i) with minimum
        }
        return nums;

    }
};