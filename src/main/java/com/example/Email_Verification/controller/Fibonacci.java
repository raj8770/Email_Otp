package com.example.Email_Verification.controller;

public class Fibonacci {

   public static void main(String[]args){

       int n = 10;
       printFibonacci(n);
   }


   public static void printFibonacci(int n){
       int a = 0, b= 1;
       for(int i =0; i<n; i++){
           System.out.print(a+"");
           int temp = a;
           a=b;
           b = temp+b;
       }
   }

}
