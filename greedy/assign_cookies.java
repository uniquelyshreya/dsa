import java.util.*;

class assign_cookies {
    
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0;
        int right = 0;
        int ans=0;
        while(left<g.length && right<s.length){
            if(g[left]<=s[right]){
                ans++;
                right++;
                left++;
            }
            else right++;
        }
    return ans;
    }
    public static void main(String[]args){

    }
}
