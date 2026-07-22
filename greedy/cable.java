import java.util.*;

public class cable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of positions");
       int n = sc.nextInt();
       System.out.println("enter positions");
       int[] pos = new int[n];
       for(int i=0;i<n;i++){
        pos[i] = sc.nextInt();
       }
       Arrays.sort(pos);
       
       System.out.println("Enter the back range");
       int b = sc.nextInt();
       System.out.println("Enter the forward range");
       int f = sc.nextInt();

       int i =0;
       int boosters = 0;
       ArrayList<Integer> list = new ArrayList<>();
       while(i<n){
        int start = pos[i];
        while(i<n && pos[i]<= start+b){
            i++;
        }
        boosters++;
        list.add(pos[i-1]);
        int bpos = pos[i-1];
        while(i<n && pos[i]<=bpos+f){
            i++;
        }
       }

       System.out.println("no. of boosters " + boosters);
       for(int a : list){
        System.out.println("positions " + a);
       }

    }
}
