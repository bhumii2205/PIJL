import java.util.*; // Importing the Scanner class for user input

// Class to handle user input
public class UserInput {

    // Method to take two integer inputs from the user
    int[] userInput() {
        int[] arr = new int[2]; // Array to store two numbers
        
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for input
        
        System.out.println("Enter 1st number:"); // Prompting user for first number
        arr[0] = sc.nextInt(); // Storing first number in array
        
        System.out.println("Enter 2nd number:"); // Prompting user for second number
        arr[1] = sc.nextInt(); // Storing second number in array
        
        return arr; // Returning the array containing both numbers
    }
}
