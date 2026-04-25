class Solution {
public:
    bool isAnagram(string s, string t) {
//  sort(s.begin(),s.end());
//  sort(t.begin(),t.end());
// if(s == t)
// return true;
// else return false;
unordered_map<char,int> freq;
int n = s.length();
int m = t.length();
if(n!=m) return false;
for(int i=0;i<n;i++){
 freq[s[i]]++;
 freq[t[i]]--;
}
 for(auto it:freq){
    if(it.second!=0) return false;
 }
 return true;
    }
};