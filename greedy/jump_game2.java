class Solution {
    public int jump(int[] nums) {
      int curr = 0;
      int farthest = 0;
      int jump = 0;
      for(int i=0;i<nums.length-1;i++){
        if(i+nums[i]>farthest){
            farthest = i+nums[i];

        }
        if(i==curr){
            jump++;
            curr = farthest;
        }
      }
      return jump;
    }
}

// SOLUTION 2 APPROACH 2 

class Solution {
    public int jump(int[] nums) {
int l=0;
int r=0;
int jump=0;
while(r<nums.length-1){
    int farthest = r;
    for(int i=l;i<=r;i++){
        farthest = Math.max(farthest,i+nums[i]);


    }
    l = r+1;
    r = farthest ;
    jump++;
}
return jump;

    }
}
