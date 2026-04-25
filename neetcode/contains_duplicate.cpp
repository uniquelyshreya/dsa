class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        int n = nums.size();
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if (nums[i]==nums[j]){
                    return true;            //o(n^2) time complexity try to find more optimal solution
                }
            }
        }
        return false;
    }
};



class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
       unordered_set<int> seen;
       int n = nums.size();
       for(int i=0;i<n;i++){
        if(seen.find(nums[i]) != seen.end()){
            return true;
        }
        seen.insert(nums[i]);
       }
       return false;
    }
};