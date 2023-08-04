// Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

// Note that the same word in the dictionary may be reused multiple times in the segmentation.

// Example 1:

// Input: s = "leetcode", wordDict = ["leet","code"]
// Output: true
// Explanation: Return true because "leetcode" can be segmented as "leet code".

//I used a dp approach:
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        Set<String> words = new HashSet<>(wordDict);
    
        dp[0] = true;
        
        for(int i=1;i<s.length()+1;i++){

            for(int j=0;j<i;j++){
                if(dp[j]&&words.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }

        }        

        return dp[s.length()];      
    }
}
