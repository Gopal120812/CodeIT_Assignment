package com.exercise;

import java.util.Scanner; 

public class ArrayMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a new Scanner object to read input from the console
        System.out.print("Enter the number of elements in the array: "); // Prompt the user to enter the number of elements 
        int n = scanner.nextInt(); 
        
        int[] arr = new int[n]; // Create a new int array of size n to store the elements of the array
        System.out.println("Enter the "+n+" elements of the array:"); // Prompt the user to enter the elements of the array
        for (int i = 0; i < n; i++) { // Loop through the array and read each element from the user
            arr[i] = scanner.nextInt(); // Store the user's input in the current element of the array
        }
        
        int maxElement = arr[0]; // Create a new int variable to store the maximum element and initialize it with the first element of the array
        for (int i = 1; i < n; i++) { // Loop through the remaining elements of the array
            if (arr[i] > maxElement) { // If the current element is greater than the current maximum element
                maxElement = arr[i]; // Update the value of maxElement to the new element
            }
        }
        
        System.out.println("The maximum element in the array is: " + maxElement); // Print the maximum element to the console
        scanner.close(); 
    }
}

