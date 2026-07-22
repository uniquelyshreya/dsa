class Solution {
public:
    int missingNumber(vector<int>& nums) {
       int n = nums.size();
       int sum=0;
       for(int i=0;i<n;i++){
       sum+=nums[i]; // idhar tune sum+i kiya wtf
       } 
      int  totalsum = n*(n+1)/2; // formula yaad rakho bkl
       int missing = totalsum - sum;
       return missing;
    }
};
// idk i am sleepy or wot but isme to galti nii honi chahiye thi