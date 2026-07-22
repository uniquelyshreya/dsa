public class Solution {
    static String reverse(String s){
            char[] arr = s.toCharArray();
       int i =0;
       int j = arr.length -1;
       while(i<j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
       }
      return new String(arr);
    }
    public String reverseWords(String s) {
     s = reverse(s);
     
     StringBuilder ans = new StringBuilder();
     for(int i =0;i<s.length();i++){
        StringBuilder word = new StringBuilder();
        
        
        while(i<s.length() && s.charAt(i)!=' '){
            word.append(s.charAt(i));
            i++;
        }
    //i add spaces between the words we have to remove it to have only one blank space
    if(word.length() > 0){
     ans.append(reverse(word.toString()));
      ans.append(" ");
     }
     }
    return ans.toString().trim();
    }
} 
    

