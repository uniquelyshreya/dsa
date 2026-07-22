class Solution {
public:
    vector<int> unionArray(vector<int>& nums1, vector<int>& nums2) {
      int i=0;
      int j=0;
      int n1 = nums1.size();
      int n2 = nums2.size();
      vector<int> res;
      while(i<n1 && j<n2){
        if(nums1[i]<nums2[j]){
            if(res.empty() || res.back() != nums1[i]){
            res.push_back(nums1[i]);
            
            }
            i++; // i block ke bahar increment karo
        }
        else if(nums1[i]>nums2[j]){
             if(res.empty() || res.back() != nums2[j]){
            res.push_back(nums2[j]);
            
             }
             j++;
        }
        else{
            if(res.empty() || res.back() != nums2[j]){
            res.push_back(nums2[j]);
            
             }
            i++;
            j++;
        } 
      }
    
        while(i<n1){
             if(res.empty() || res.back() != nums1[i]){
            res.push_back(nums1[i]);
             }
            i++;

        }
        while(j<n2){
             if(res.empty() || res.back() != nums2[j]){ // bhai idhar bhi condition daalo
            res.push_back(nums2[j]);
             }
            j++;
        }
      return res;
    }
};