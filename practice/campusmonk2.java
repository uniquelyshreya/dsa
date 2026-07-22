import java.util.*;

public class campusmonk2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();

        }
        int greater = arr[0];
        int count = 1;
        for(int a : arr){
            if(a>greater){
                greater = a;
                count++;
            }
        }
        System.out.println(count);

    }
}
