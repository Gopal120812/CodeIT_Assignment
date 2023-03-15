package com.exercise;

public class FizzBuzz {
    public static void main(String[] args) {
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Checking if i is a multiple of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
            	// Print "FizzBuzz" if i is a multiple of both 3 and 5
                System.out.println("FizzBuzz");   
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz"); // Print "Fizz" if i is a multiple of 3 but not 5
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz"); // Print "Buzz" if i is a multiple of 5 but not 3
            } 
            else {
                System.out.println(i); // Print i if it is not a multiple of 3 or 5
            }
        }
    }
}
