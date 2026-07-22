// n = no. of monkeys 
// k == bananna monkey can eat , j = peanuts monkey can eat

// m = total banana p = total peanuts


import java.util.*;
public class campusmonkvvi {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int m = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
       
       
        int banana = (m+k-1)/k;
        int peanuts = (p+j-1)/j;
        int ans = n - Math.min(banana,peanuts);
        System.out.println(ans);
    }
    
}
