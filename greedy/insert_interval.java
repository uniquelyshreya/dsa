import java.util.ArrayList;

public class insert_interval {
   
    public int[][] insert(int[][] intervals, int[] newInterval) {
      ArrayList<int[]> ans = new ArrayList<>();
      int i=0;
      int n = intervals.length;

      while(i<n && newInterval[0]>intervals[i][1]){
        ans.add(intervals[i]);
        i++;
      }  
      while(i<n && intervals[i][0]<=newInterval[1]){
        newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
        newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
        i++;
      }
      ans.add(newInterval);
      while(i<n){// now we have no overlapping intervals so just add remaining
       
        ans.add(intervals[i]);
        i++;
        
      }
      //int[][] result = new int[ans.size()][2];
      //for(int i=0;i<ans.size();i++){
      // result[i] = ans.get(i);}
      return ans.toArray(new int[ans.size()][]);
    }

}
