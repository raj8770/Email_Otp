package com.example.Email_Verification.controller;

import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "({[]})";
        String test2 = "({[)]}";
        String test3 = "({[]})[]";
        String test4 = "(";

        // Print results
        System.out.println("Test 1: " + isBalanced(test1)); // true
        System.out.println("Test 2: " + isBalanced(test2)); // false
        System.out.println("Test 3: " + isBalanced(test3)); // true
        System.out.println("Test 4: " + isBalanced(test4)); // false
    }
}
