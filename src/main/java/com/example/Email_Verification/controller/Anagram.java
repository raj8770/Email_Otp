package com.example.Email_Verification.controller;

import java.util.Arrays;

public class Anagram {

    public static void main(String[]args){

        String str1 = "listen", str2 = "silent";
        System.out.println(areAnagram(str1,str2)?"areAnagram":"notAnagram");
    }
    public static boolean areAnagram(String str1, String str2){
        return str1.length() == str2.length() && Arrays.equals(str1.toCharArray(),str2.toCharArray());
    }
}
