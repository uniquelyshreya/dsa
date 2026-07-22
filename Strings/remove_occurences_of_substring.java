public class Solution {
    public String removeOccurrences(String s, String part) {
        // while(s.contains(part)){
        //     s = s.replaceFirst(part,"");
        // }
        // return s;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            sb.append(ch);
                if(sb.length()>= part.length()){
                    if(sb.substring(sb.length() - part.length()).equals(part)){
                        sb.delete(sb.length() - part.length(),sb.length());
                    }
                }
        }
        return sb.toString();
        // ******** BETTER *********
//         StringBuilder ans = new StringBuilder();
// for(int i =0;i<s.length();i++){
//      ans.append(s.charAt(i));
//     if(ans.length()>= part.length()){
//         if(ans.substring(ans.length()-part.length()).equals(part)){
//             ans.delete(ans.length()-part.length(),ans.length());
    }
} 
    

