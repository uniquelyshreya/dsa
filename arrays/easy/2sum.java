package arrays.easy;

public class 2sum {
    
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int wanted = target - nums[i];
            if(map.containsKey(wanted)){
             int i1 =   map.get(wanted);
             return new int[]{i1,i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        
    }
}

