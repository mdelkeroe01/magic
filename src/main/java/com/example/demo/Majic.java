package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController


public class Majic {
    //

        System.out.println("integer");
        System.out.println("Enter a number: ");

        System.out.println("beginning with the number " + num + ".");



    // n > 1
    public static int solve(int n) {
        if (n == 1) {
            return 0;
        } else if (n % 2 == 0) {
            return 1 + solve(n / 2);
        } else {
            return 1 + solve(n * 3 + 1);
        }
    }
}
