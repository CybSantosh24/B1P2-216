/**
 * MAIN CLASS PalindromeChecker
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * The application:
 * - Uses palindrome algorithms
 * - Captures execution start time
 * - Calculates execution time
 * - Displays results
 *
 * Author: Developer
 * Version: 13.0
 */

public class UC13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Start time
        long startTime = System.nanoTime();

        boolean result = checkPalindrome(input);

        // End time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
        System.out.println("Execution Time: " + executionTime + " ns");
    }


    /**
     * Simple palindrome method
     */
    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}