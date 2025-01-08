package com.example.Email_Verification.controller;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void findDuplicates(int [] nums){

        Set<Integer> seen = new HashSet<>();

        for (int num : nums){
            if (!seen.add(num)){
                System.out.println("Duplicates: " +num);

            }
        }
    }

    public static void main(String[] args){
        int [] num = {1,2,3,4,2,5,6,3};
        findDuplicates(num);
    }
}
