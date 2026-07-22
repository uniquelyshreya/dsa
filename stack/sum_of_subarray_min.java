class Solution {
    public long subArrayRanges(int[] nums) {
    // find sum of subarray min
   int n = nums.length;
   int[] pse = new int[n];
   int[] nse = new int[n];
   Stack<Integer> st = new Stack<>();
   for(int i =0;i<n;i++){
   while(!st.isEmpty() && nums[st.peek()]>nums[i]){
    st.pop();
   } 
   pse[i] = st.isEmpty()? -1 : st.peek();
   st.push(i);

    }
    st.clear();
    for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && nums[st.peek()]>= nums[i]){
            st.pop();
        }
        nse[i] = st.isEmpty() ? n : st.peek();
        st.push(i);
    }
    long sumofmin = 0;
    long mod = 100000008;
    for(int i =0; i<n;i++){
        long left = i - pse[i];
        long right = nse[i] - i;
        sumofmin += (nums[i]*left*right);
    }
    st.clear();
    // find sum of sumarray  max
    int pge[] = new int[n];
    int nge[] = new int[n];
    for(int i =0;i<n;i++){
        while(!st.isEmpty() && nums[st.peek()]< nums[i]){
            st.pop();
        }
        pge[i] = st.isEmpty()? -1 : st.peek();
        st.push(i);
    }
    st.clear();
    for(int i =n-1;i>=0;i--){
        while(!st.isEmpty() && nums[st.peek()]<= nums[i]){
            st.pop();
        }
        nge[i] = st.isEmpty()? n: st.peek();
        st.push(i);
    }
    long sumofmax = 0;
    for(int i=0;i<n;i++){
        long left = i-pge[i];
        long right = nge[i] - i;
        sumofmax += (nums[i]*left*right); // no need of mod here
    }
    long ans = sumofmax - sumofmin;
    return ans;
    }
}