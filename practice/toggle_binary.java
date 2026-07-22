//take decimal no. as input->convert into binary->toggle all the bits->reurn decimal ans
import java.util.*;
class toggle_binary{
    static int pow(int a ,int n){
        int ans = 1;
        if(n==0) return 1;
        while(n>0){
            ans = ans*a;
            n--;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        StringBuilder bin = new StringBuilder();
        while(no>0){
          bin.append(no%2);  
          no = no/2;
        }
        
        bin.reverse();
        char[] arr = bin.toString().toCharArray();
        int ans = 0;
        int n = arr.length;
       for(int i=0;i<n;i++){
        if(arr[i] == '0') arr[i] = '1';
        else arr[i] = '0';
       }
       //int len = arr.length;
       
       for(int i = 0;i<n;i++){
        if(arr[i] == '0') continue;
        else{
            ans += pow(2,n-1-i);
           
        }
       }
    

//     Scanner sc = new Scanner(System.in);

// int no = sc.nextInt();

// int bits = Integer.toBinaryString(no).length();

// int mask = (1 << bits) - 1;

// int ans = no ^ mask;

// System.out.println(ans); 
      System.out.println(ans);
    }
}