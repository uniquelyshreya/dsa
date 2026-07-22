import java.util.*;
public class campusmonk3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // vvi remember this
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }
       HashMap<String,Integer> map = new HashMap<>();
        for(String s : arr){
         map.put(s.toLowerCase(),map.getOrDefault(s.toLowerCase(),0)+1);   

        }
        int flag = 0;
        for(String s : arr){
            int count = map.get(s.toLowerCase());
            if(count%2 != 0){
                System.out.println(s);
                flag = 1;
                break;
            }
        }
        if(flag == 0) System.out.println("All are even");
    }
}
