
#include <iostream>
#include<vector>
//#include <bits/stdc++.h>
using namespane std;
class Solution {
public:
    int largestElement(vector<int>& nums) {
        int n = nums.size();
int max = nums[0];
for(int i=0;i<n;i++){
    if(nums[i]>max){
        max = nums[i];
    }
}
return max;
    }
};
int main(){
cout<<"enter the size of array\n"
int n ;
cin>>n ;
vector<int> nums(n);
cout<<"enter the array\n"
for(int i=0;i<n;i++){
cin >> nums[i];
}
Solution obj;
int res = obj.largestElement(nums);
cout<<res;



}