class Solution {
public:
    int secondLargestElement(vector<int>& nums) {
        int secmax = -999;
        int max = -999;
        int n = nums.size();
for(int i=0;i<n;i++){
if(nums[i]>max){
    secmax = max;
    max = nums[i];// update secmax first and then max
    
    
}
else if(nums[i]>secmax && nums[i]!= max){
    secmax = nums[i]; 
}
}
if(secmax == -999){
    return -1;
}
else
return secmax;
       
       
      
    }
};