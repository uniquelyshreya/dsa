#include <iostream>
#include <vector>
using namespace std;


class Solution{	
	public:
		bool isSorted(vector<int>& nums){
			//your code goes here
            int n = nums.size();
            for(int i=0;i<n-1;i++){
                if(nums[i]>nums[i+1]) return false;
            }
            return true;
		}
};
int main(){
    cout<<"enter no. of elements";
    int n;
    cin>>n;
    cout<<"enter the array";
    vector<int> arr(n);
    for(int i=0;i<n;i++){
 cin >> arr[i];
    }
    Solution obj;
    cout << obj.isSorted(arr);
 return 0;  
}
