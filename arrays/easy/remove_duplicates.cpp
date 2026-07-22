#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
       //brute method is to use a set  tc nlogn sc O(n)
       //optimal way is to use 2 pointer
       int n = nums.size();
       int p1=0;
      // wtf int p2=1;
       //int count =0;
       for(int p2=1;p2<n;p2++){
       if(nums[p1]!=nums[p2]){
        p1++;
        nums[p1]=nums[p2];
        
       }
       }
       return (p1+1);// i was returning p1 which was index of last unique element
    }
};
int main(){
    int n;
    cout << "enter no. of elements";
    cin>>n;
    cout << "enter the array";
    vector<int> arr(n);
   for(int i=0;i<n;i++){
    cin>>arr[i];
   }
   Solution obj;
   int res = obj.removeDuplicates(arr);
   cout<<res;

    
}