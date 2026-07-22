class Overlapping_intervals {
    public int eraseOverlapIntervals(int[][] intervals) {
      //how to sort intervals 
      int n = intervals.length;
    //   for(int i=0;i<n-1;i++){
    //     for(int j=0;j<n-1-i;j++){
    //         if(intervals[j][1]>intervals[j+1][1]){
    //             int[] temp = intervals[j];
    //             intervals[j] = intervals[j+1];
    //             intervals[j+1]=temp;
    //         }
    //     }
    //   }  it gives tle
      Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));// OR (a,b)->a[1]-b[1]
    int prevend = intervals[0][1];
    int count = 0;
  
    for(int i=1;i<n;i++){
        int start = intervals[i][0];
        if(prevend>start){
         //   prevend = intervals[i][1];
            count++;
        }
      else  prevend = intervals[i][1];
    }
    return count;
      }
    }