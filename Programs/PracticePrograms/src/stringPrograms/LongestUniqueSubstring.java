package stringPrograms;

import java.util.HashSet;

public class LongestUniqueSubstring {

    public static String longestUniqueSubstring(String s) {
        int start = 0, end = 0;
        int maxLen = 0;
        int maxStart = 0;

        HashSet<Character> seen = new HashSet<>();

        while (end < s.length()) {
            char currentChar = s.charAt(end);

            // If character is not in set, add and move end pointer
            if (!seen.contains(currentChar)) {
                seen.add(currentChar);
                end++;

                // Update max substring info if needed
                if (end - start > maxLen) {
                    maxLen = end - start;
                    maxStart = start;
                }
            } else {
                // If char already in set, remove from start until it's gone
                seen.remove(s.charAt(start));
                start++;
            }
        }

        return s.substring(maxStart, maxStart + maxLen);
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = longestUniqueSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}

