package com.example.Email_Verification.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FibonacciController {

    @GetMapping("/fibonacci/{n}")
    public String getFibonacci(@PathVariable int n){

        StringBuilder result = new StringBuilder();
        int first = 0, second = 1;
        if (n > 0){
            result.append(first);
        }

        if (n > 1){
            result.append(",").append(second);
        }

        for (int i = 2;i<n;i++){
            int next = first + second;
            result.append(",").append(next);
            first = second;
            second = next;
        }

        return result.toString();
    }


}
