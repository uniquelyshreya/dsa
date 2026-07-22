class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
     int n = nums.size();
     unordered_map <int,int>m;
     int count=0;
     int psum = 0;
     for(int i=0;i<n;i++){
        psum+=nums[i];
        int required = psum - k;
        if(psum==k){
            count++;
        }
        if(m.find(required)!=m.end()){
        count+=m[required];
        }
        // if(m.find(m[psum])!= m.end()){
        //     m[psum]=0;
        // }
        m[psum]++;

     }  
     return count; 
    }
};