class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int a = nums1.length-1;
       int i = m-1;
       int j = n-1;
       
        while(i>=0 && j>=0 && a>=0){
        if(nums1[i]>nums2[j]){
            nums1[a] = nums1[i];
            i--;
            a--;
        }
        else{
            nums1[a] = nums2[j];
            j--;
            a--;
        }
       }
       while(i>=0){
        nums1[a] = nums1[i];
        a--;
        i--;
       } 
       while(j>=0){
        nums1[a] = nums2[j];
        j--;
        a--;

       }

    }
}