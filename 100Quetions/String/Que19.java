/*Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.*/

public class Que19 {

        public static String longestPalindrome(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }
    
            int start = 0, end = 0;
            for (int i = 0; i < s.length(); i++) {
                // Check for odd-length palindromes centered at i
                int len1 = expandAroundCenter(s, i, i);
                // Check for even-length palindromes centered at i and i+1
                int len2 = expandAroundCenter(s, i, i + 1);
                
                // Determine the maximum length palindrome centered at current position
                int maxLength = Math.max(len1, len2);
                
                // Update start and end indices of the longest palindrome found so far
                if (maxLength > end - start) {
                    start = i - (maxLength - 1) / 2;
                    end = i + maxLength / 2;
                }
            }
    
            // Extract and return the longest palindromic substring
            return s.substring(start, end + 1);
        }
    
        private static int expandAroundCenter(String s, int left, int right) {
            // Expand outwards from the center (left, right) to find the longest palindrome
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            // Return the length of the palindrome found
            return right - left - 1;
        }
    
        public static void main(String[] args) {
            String s = "baabaad";
            System.out.println("Longest Palindromic Substring: " + longestPalindrome(s)); // Output: "bab" or "aba"
        }
    }
