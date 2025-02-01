// Calculator class to perform basic arithmetic operations
class Calculator {

    // Method to perform addition of two numbers
    public static int addition() {
        int[] nums; // Array to store user input values
        UserInput obj = new UserInput(); // Creating an instance of UserInput class
        nums = obj.userInput(); // Calling userInput() method to get user input
        int sum = nums[0] + nums[1]; // Adding the two numbers
        return sum; // Returning the result
    }

    // Method to perform subtraction of two numbers
    public static int subtraction() {
        int[] nums; // Array to store user input values
        UserInput obj1 = new UserInput(); // Creating an instance of UserInput class
        nums = obj1.userInput(); // Calling userInput() method to get user input
        int diff = nums[0] - nums[1]; // Subtracting the second number from the first
        return diff; // Returning the result
    }

    // Method to perform multiplication of two numbers
    public static int multiplication() {
        int[] nums; // Array to store user input values
        UserInput obj2 = new UserInput(); // Creating an instance of UserInput class
        nums = obj2.userInput(); // Calling userInput() method to get user input
        int mul = nums[0] * nums[1]; // Multiplying the two numbers
        return mul; // Returning the result
    }

    // Method to perform division of two numbers
    public static int division() {
        int[] nums; // Array to store user input values
        UserInput obj3 = new UserInput(); // Creating an instance of UserInput class
        nums = obj3.userInput(); // Calling userInput() method to get user input
        int div = nums[0] / nums[1]; // Dividing the first number by the second (ensure no division by zero)
        return div; // Returning the result
    }
}
