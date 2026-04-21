class Solution {
public:
bool helper(string s,int i){
 if(i<= s.size()/2) return true;
        if(s[i] != s[s.size()-i-1]){
            return false;
        }
        return helper(s,i+1);
}
    bool isPalindrome(string s) {
        s.LowerCase();
        
        return helper(s,0);
       

    }
};



 class Solution {
public:
    bool isPalindrome(string s) {
       int left =0;
       int right = s.size()-1;
       while(left<right){
        while(left<right && !isalnum(s[left])){
            left++;

        }
        while(left<right && !isalnum(s[right])){
            right--;
        }
        if(tolower(s[left])!= tolower(s[right])){
            return false;
        }
        left++;
        right--;
       
       } 
        return true; // if the true is inside the loop there is no point of loop and it will not have 
        // return value for each ques for eg " " null string it will not return anything 
    }
};