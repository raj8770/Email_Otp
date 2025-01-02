package com.example.Email_Verification.controller;

public class MissingNumber {

    public static void main(String[]args){
        int[]nums ={1,2,3,4,5,6};

        System.out.println(findMissing(nums));
    }

    public static int findMissing(int [] nums){
        int n = nums.length+1;
        int sum = n *(n+1)/2;
        int arraySum = 0;
        for (int num :nums) arraySum += num;
        return sum - arraySum;

    }
}
