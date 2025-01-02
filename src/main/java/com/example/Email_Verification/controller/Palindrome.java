package com.example.Email_Verification.controller;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str) ? "Palindrome" : "Not Palindrome");
    }

    public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

}

