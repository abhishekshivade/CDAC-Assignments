/* Write an efficient function in C/C++ or Java to print the smallest substring in a given string containing all characters of another String. For example, if the given String is "this is a test string" and "tist", then the output should be "t stri".
*/

public class Que11 {
    public static void main(String[] args) {
                String s = "this is a test string";
                String t = "tist";
        
                // Edge case: If either string is empty or t is longer than s
                if (s == null || t == null || t.length() > s.length()) {
                    System.out.println("No valid substring found.");
                    return;
                }
        
                // Frequency arrays for characters in t and the current window in s
                int[] targetFreq = new int[256];
                int[] windowFreq = new int[256];
        
                // Populate targetFreq with frequencies of characters in t
                for (int i = 0; i < t.length(); i++) {
                    targetFreq[t.charAt(i)]++;
                }
        
                int requiredCharacters = 0; // Number of distinct characters to match
                for (int count : targetFreq) {
                    if (count > 0) {
                        requiredCharacters++;
                    }
                }
        
                int formedCharacters = 0; // Number of distinct characters formed in the current window
                int minWindowLength = Integer.MAX_VALUE;
                int start = 0, end = 0; // Pointers for the sliding window
                int minStart = 0; // Start index of the minimum window substring
        
                // Sliding window approach
                while (end < s.length()) {
                    char currentChar = s.charAt(end);
                    windowFreq[currentChar]++;
        
                    // Check if the current character forms a required character in the window
                    if (targetFreq[currentChar] > 0 && windowFreq[currentChar] == targetFreq[currentChar]) {
                        formedCharacters++;
                    }
        
                    // Try to minimize the window by moving the start pointer
                    while (formedCharacters == requiredCharacters && start <= end) {
                        // Update the minimum window length
                        int windowSize = end - start + 1;
                        if (windowSize < minWindowLength) {
                            minWindowLength = windowSize;
                            minStart = start;
                        }
        
                        char startChar = s.charAt(start);
                        windowFreq[startChar]--;
        
                        // Check if removing the start character affects the required characters count
                        if (targetFreq[startChar] > 0 && windowFreq[startChar] < targetFreq[startChar]) {
                            formedCharacters--;
                        }
        
                        // Move the start pointer to shrink the window
                        start++;
                    }
        
                    // Move the end pointer to expand the window
                    end++;
                }
        
                // Extract the minimum window substring if found
                if (minWindowLength != Integer.MAX_VALUE) {
                    String smallestSubstring = s.substring(minStart, minStart + minWindowLength);
                    System.out.println(smallestSubstring);
                } else {
                    System.out.println("No valid substring found.");
                }
        

    }
}
