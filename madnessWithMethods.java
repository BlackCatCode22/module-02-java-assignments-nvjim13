// 9/5/24
// maddnessWithMethods.java


import java.util.Scanner;

public class madnessWithMethods {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my Madness With Methods program");

        // Get user input
        int firstInput = 0;
        firstInput = getUserInput();

        System.out.println("\nThe user input number is: " + firstInput);

        // Find the largest of two ints
        int firstNum = 8;
        int secondNum = 4;
        int largest = 0;

        // Call the method named compareTwoInts()
        largest = compareTwoInts(firstNum, secondNum);
        System.out.println("\nThe largest of " + firstNum + " and " + secondNum + " is: " + largest);

        // Sum two ints
        int sumOfTwoInts = 0;
        sumOfTwoInts = sumTwoInts(firstNum, secondNum);
        System.out.println("\nThe sum of " + firstNum + " and " + secondNum + " is: " + sumOfTwoInts);

    }

    // Method to get user input
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        // Let's read the number from the user
        int firstInput = scanner.nextInt();
        // Return the input to the calling method
        return firstInput;
    }

    // Method to compare two integers and return the largest
    public static int compareTwoInts(int firstInt, int secondInt) {
        int largest = 0;
        if (firstInt > secondInt) {
            largest = firstInt;
        } else {
            largest = secondInt;
        }
        return largest;
    }

    // Method to return the sum of two integers
    public static int sumTwoInts(int num1, int num2) {
        int theSum = num1 + num2;
        return theSum;
    }
}