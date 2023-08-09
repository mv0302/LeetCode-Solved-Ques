// Given a string s, find the length of the longest substring without repeating characters.
// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

//Explaination of code
// Use a sliding window approach:

// Initialize left and right pointers to 0.
// While the right pointer is within the bounds of the string:
// Retrieve the character at the right position using s.charAt(right).
// Check if the set does not contain the current character:
// If true, it means the character has not been seen before in the current substring.
// Add the character to the set to mark its presence in the substring.
// Update longestSubstringLength by taking the maximum of its current value and the length of the current substring (right - left + 1).
// Move the right pointer to the right to expand the current substring.
// If the set already contains the current character:
// Remove the character at the left position from the set, indicating that the character is no longer part of the current substring.
// Move the left pointer to the right to shrink the current substring and eliminate the repeated character.

class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int longestSubstringLength = 0;
        int left = 0;
        int right = 0;

        while (right < n) {
            char currentChar = s.charAt(right);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
         longestSubstringLength = Math.max(longestSubstringLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return longestSubstringLength;
    }
}
