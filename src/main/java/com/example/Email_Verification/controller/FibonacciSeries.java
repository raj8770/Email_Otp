package com.example.Email_Verification.controller;

public class FibonacciSeries {


    public static void printFibonacci(int n){

        int first = 0, second = 1;

        System.out.print(first+"," +second);

        for (int i = 2; i<n; i++){
            int next = first + second;
            System.out.print(","+next);
            first = second;
            second = next;
        }
    }

    public static void main(String[] args){
        int n = 5;
        System.out.print("Fabonacci series up to"+n+"terms");
        printFibonacci(n);
    }
}
