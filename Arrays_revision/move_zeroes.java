//package Arrays_revision;
import java.util.*;
public class move_zeroes {
    public static void swap(int[] arr,int i,int j){ // you cannot swap int a, int b babygurl
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int i=0;
    while(i<n){
        if(arr[i]==0) break;
        i++;
    }
    for(int j=i+1;j<n;j++){
        if(arr[j]!=0){
            swap(arr,i,j);
            i++;
        }
    }
    for(int j=0;j<n;j++){
        System.out.print(arr[j] +"  ");
    }
    
   } 
}
