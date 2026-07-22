import java.util.*;

public class count_sunday {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        int range = sc.nextInt();
        int code = 0;
        if(day.toLowerCase().equals("monday")) code = 0;
       else if(day.toLowerCase().equals("tuesday")) code = 1;
        else if(day.toLowerCase().equals("wednesday")) code = 2;
        else if(day.toLowerCase().equals("thursday")) code = 3;
        else if(day.toLowerCase().equals("friday")) code = 4;
        else if(day.toLowerCase().equals("saturday")) code = 5;
        else code = 6;
        // should use hashmap
        // Map<String,Integer> map = new HashMap<>();
        // map.put("monday",0);
        // map.put("tuesday",1); at end map.get(day.toLowerCase());
        int firstsun = 6-code;
        //edge case 
        if(firsun>range){
            System.out.println(0);
        }
       else{ int rem = range-firstsun;
        int numofsun = (rem/7) + 1;
        System.out.println(numofsun);
       
       }
    }
    
}
