package com.example.Email_Verification.controller;

import java.util.HashSet;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();
        String s = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters: " +
                solution.lengthOfLongestSubstring(s));
    }
}


