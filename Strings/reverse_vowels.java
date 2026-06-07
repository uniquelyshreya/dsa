public class reverse_vowels {
    boolean isvowel(char c){
        char ch = Character.toLowerCase(c);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        else return false;
    }
    public String reverseVowels(String s) {
      int low = 0;
      int high = s.length()-1;
      char[] arr = s.toCharArray();
      while(low<high){
        while(low< high && !isvowel(arr[low])) {
            low++;
            }
        while(low< high && !isvowel(arr[high])){

         high--;
        }
      char temp = arr[low];
      arr[low]= arr[high];
      arr[high]=temp;
      low++;
      high--;
      
      }
      return new String(arr);  
    }
} 
