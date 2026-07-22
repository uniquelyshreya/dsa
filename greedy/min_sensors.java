
import java.util.*;
class min_sensors{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no. of points ");
      int n = sc.nextInt();
      int[] critical_points = new int[n];
      System.out.println("enter the points");
      for(int i=0;i<n;i++){
         critical_points[i] = sc.nextInt();
      }
       System.out.println("enter the range");
       int range = sc.nextInt();
       //input[1,2,3,5,9] output = 2
       int sensor =0;
       ArrayList<Integer> ans = new ArrayList<>();
       Arrays.sort(critical_points);
       int i=0;
       while(i<n){
        int start = critical_points[i];
        while(i<n && critical_points[i]<= range+start){
                i++;
        }
        int pos = critical_points[i-1];
        ans.add(critical_points[i-1]);
        sensor++;
        while(i<n && critical_points[i]<= pos+range ){
            i++;
        }
       }
       System.out.println("ans"+sensor);
       for(int a : ans){
        System.out.println(a);
       }
      

    }
}