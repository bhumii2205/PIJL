// Calculator class to perform basic arithmetic operations
class Calculator {
    
    // Method to perform addition of two numbers
    public static int addition() {
        int[] nums; // Array to store user input values
        
        UserInput obj = new UserInput(); // Creating an instance of UserInput class
        nums = obj.userInput(); // Calling the userInput() method to get user input
        
        int sum = nums[0] + nums[1]; // Adding the two numbers from the array
        
        return sum; // Returning the sum of the two numbers
    }
}
