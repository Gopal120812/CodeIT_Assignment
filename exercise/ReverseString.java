package com.exercise;

import java.util.Scanner; 

public class ReverseString {
    public static void main(String[] args) {
    	 // Create a new Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
     // Prompt the user to enter a string
        System.out.print("Enter a string: "); 
     // Read the user's input and store it in a new String variable
        String originalString = scanner.nextLine(); 
        
        String reversedString = ""; // Create a new String variable to store the reversed string
        for (int i = originalString.length() - 1; i >= 0; i--) { // Loop through the original string in reverse order
            reversedString += originalString.charAt(i); // Append each character to the reversed string
        }
        
        System.out.println("Reversed string: " + reversedString); // Print the reversed string to the console
        scanner.close(); 
    }
}
