#include<iostream>
#include<stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(2*n);
        for(int i=0;i<2*n;i++){
            ans[i]= nums[i%n];

        }
        return ans;
    }
};
int main(){
    cout<<"enter the size of array";
    int n;
    cin >> n;
    vector<int> nums(n); //[n] means array of vectors
    for(int i=0;i<n;i++){
        cin>>nums[i];
    }
    Solution obj;
    vector<int> result = obj.getConcatenation(nums);
    for(int i=0;i<2*n;i++){
           cout<< result[i];
        }

}
