// 2. 2-wheelers and 4-wheelers

// Given

// Total vehicles = V
// Total wheels = W

// Find

// number of 2-wheelers
// number of 4-wheelers

// x + y = v
// 2x + 4y = w; 2v - 2y +4y = w -> 2v-2y = w -> (w-2v)/2 = y
// 



import java.util.*;
public class vehicles {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int v = sc.nextInt();
  int  w = sc.nextInt();
  int four = (w-2*v)/2;
  int two = v-four;
  System.out.println(two + " " + four); 
}
}
