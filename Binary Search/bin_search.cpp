class Solution {
public:
int recursivesearch(vector<int>& arr,int low,int high,int target){

int mid = (low+high)/2;
if(low>high) return -1;
    else if(arr[mid]== target) return mid;
    else if(arr[mid]>target) return recursivesearch(arr,low,mid-1 ,target);
    else return recursivesearch(arr,mid+1,high,target);
}
    int search(vector<int>& arr, int target) {
      //linear or iterative
      int n = arr.size();
      
    int low=0,high=n-1;
    int result = recursivesearch(arr,low,high,target);
    return result;

    
    //   while(low<=high){
    //   int mid=(low+high)/2;
    //   if(arr[mid]==target){
    //     return mid;
    //   }  
    //   else if(arr[mid]<target){
    //     low=mid+1;
    //   }
    //   else{
    //     high=mid-1;
    //   }
      
    //   }
    //   return -1;
    }
};