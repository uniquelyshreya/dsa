//package basic_maths;


// remove duplicates from a sorted array

import java.util.Scanner;

public class remove_duplicates {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int i =0;
    for(int j=1;j<n;j++){
        if(arr[i]!=arr[j]){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    System.out.println("no of unique elements = "+ (i+1));
    for(int j=0;j<n;j++){
        System.out.print(arr[j] +"  ");
    }
  }  
}
