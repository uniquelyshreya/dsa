class Solution{
public:
void swap(int* a,int *b ){
        int * temp = *a;
        *a = *b;
        *b = temp;
      }
void  f(int arr[],int n,int i){
            if(i>=n/2)
            return;
            swap(arr[i],arr[n-i-1]);
            f(arr,n,i+1);
        }
      
    void reverse(int arr[], int n){
        f(arr,n,0);
      
    }
};