class Solution {
public:
    int majorityElement(vector<int>& nums) {
      int n  = nums.size();
      int maj = 0,freq=0;
      for(int i=0;i<n;i++){
         if(freq==0) maj = nums[i];

       if(nums[i]==maj){
        freq++;
       }
       else freq--;
      
      }  
      return maj;
    }
};