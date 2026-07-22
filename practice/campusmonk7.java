import java.util.*;
// find the row with most no. of 1 
public class campusmonk7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        int maxcount = 0;
        int ind = 0;
        for(int i=0;i<r;i++){
            count =0;
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1) count++;
            }
            maxcount = Math.max(count,maxcount);
            ind = i;
        }
        if(maxcount == 0) System.out.print(-1);
  else  System.out.println(ind);
    }
    
}
