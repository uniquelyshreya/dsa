import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class campusmonk6 {
    static String prefix(String[] arr){
       Arrays.sort(arr);
       String first = arr[0];
       int n = arr.length;
       String last = arr[n-1];
       int flen = first.length();
       int i = 0,j=0;
       String ans = "";
        while(i<flen && j<last.length() && first.charAt(i)!= last.charAt(i)){
            first = first.substring(0,i); 

        }
        return first;
    }
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String[] arr = new String[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextLine();
    }
    System.out.println(prefix(arr));
    
  }  
}
