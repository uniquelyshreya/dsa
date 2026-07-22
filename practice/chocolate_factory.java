// move empty packets to the end
// input N=8
//[4,5,0,1,9,0,5,0]--------> [4,5,1,9,5,0,0,0]


import java.util.*;
public class chocolate_factory {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        for(int j = 0;j<n;j++){
            if(arr[j]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        for(int a : arr){
            System.out.print(a+" ");
        }

    }

    
}
