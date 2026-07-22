import java.util.*;
public class job_sequencing {
    class job{
        int id;
        int deadline;
        int profit;
        job(int id,int deadline,int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;


        }
    }

    static int[] solution(int[] jobs,int n){
        Arrays.sort(jobs,(a,b) ->b.profit-a.profit);
        int maxdeadline = 0;
         for(job x : jobs){
            maxdeadline = Math.max(maxdeadline,x.deadline);
         }
 boolean[] slot = new boolean[maxdeadline+1];
 int count = 0;
 int totalprofit = 0;
 for(job x : jobs){
    for(int i =x.deadline;i>=1;i--){
        if(!slot[i]){
            slot[i] = true;
            count++;
            totalprofit += x.profit;
            break;
        }
    }
    return new int[]{count,totalprofit};
 }



    }
    public static void main(String[] args){
      int[] jobs = {{1,2,100},{2,1,90}};
        
    }
    
}
