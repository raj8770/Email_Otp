package com.example.Email_Verification.controller;

public class ReverseString {

   public static void main(String[]args){

       String str = "Sumit";
       String reversed = reverse(str);
       System.out.println(reversed);
   }

   public static String reverse(String str){
       char[] arr = str.toCharArray();
       int n = arr.length;
       for(int i=0; i< n/2; i++){
           char temp = arr[i];
           arr[i] = arr[n-i-1];
           arr[n-i-1] = temp;
       }
       return new String(arr);
   }
}
