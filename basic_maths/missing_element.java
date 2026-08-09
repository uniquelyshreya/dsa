//package basic_maths;

import java.util.Scanner;

public class missing_element {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
int sum = n*(n+1)/2;
int arr_sum = 0;
for(int i=0;i<n;i++){
    arr_sum += arr[i];
}
int missing = sum - arr_sum;
System.out.println(missing);

    }
}
