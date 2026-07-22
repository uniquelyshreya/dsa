import java.util.*;

//[1,3] 
//[4,6]
//[7,8] sort 1,4,7 how?? --> bubble sort

class canAttendMeeting{
    static boolean canAttend(int[][]intervals){
        int n = intervals.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(intervals[j][0]>intervals[j+1][0]){
                    int[] temp = intervals[j];
                    intervals [j] = intervals[j+1];
                    intervals[j+1] = temp;
                }
            }
           
        }
        for(int i=0;i<n-1;i++){ //[[1,3][4,6][7,8]]
            int prev = intervals[i][1];
            int next = intervals[i+1][0];
            if(prev > next) return false;
            
        }
        return true;

    }
    public static void main(String[] args){
        int[][] intervals = {{1,3},{4,6},{7,8}};
        System.out.println(canAttend(intervals));

    }
}