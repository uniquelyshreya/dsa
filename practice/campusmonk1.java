import java.util.*;
public class campusmonk1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = input.length();
        int c1 = 0; // counts hash
        int c2 =0; //counts star
        for(int i =0;i<n;i++){
            if(input.charAt(i)=='#') c1++;
            else c2++;

        }
        if(c1==c2) System.out.println(0);
        else if(c2>c1) System.out.println(c2-c1);
        else System.out.println(c2-c1);
    }
}
