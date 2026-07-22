class data{
           int start;
           int end;
           int pos;
          data(int start,int end,int pos){
              this.start = start ;
              this.end = end;
              this.pos = pos;
          } 
       }

class N_meetings { 
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        int n = s.length;
      data[] arr = new data[n];
      for(int i=0;i<n;i++){
          arr[i] = new data(s[i],f[i],i+1);
          
      }
      Arrays.sort(arr,(a,b)->{
          if(a.end==b.end) return a.pos-b.pos;
          return a.end-b.end;
      });
      int count = 0;
      ArrayList<Integer> ans = new ArrayList<>();
      ans.add(arr[0].pos);
      int freetime = arr[0].end;
      for(int i=1;i<n-1;i++){
          if(freetime<arr[i].start){
              count++;
              ans.add(arr[i].pos);
              freetime = arr[i].end;
          }
      }
      return ans;
        
    }
}
