// BRUTE FORCE


public class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length()) return false;
        // s = s+s;
        // return s.contains(goal);
        String curr = s;
        for(int i =0;i<s.length();i++){
            curr = curr.substring(1)+ curr.charAt(0);
            if(curr.equals(goal)) return true;
        }
        return false;
        
    }


    // OPTIMAL

    class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length()) return false;
        s = s+s;
        return s.contains(goal);
        
    }
}
