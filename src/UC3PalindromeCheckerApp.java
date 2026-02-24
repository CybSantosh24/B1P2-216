/**
 * =========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the result
 *
 * @author Developer
 * @version 3.0
 */

public class UC3PalindromeCheckerApp {

    /**
     * Application entry point for UC3
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        String reversed = "";

        // Iterate from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {

            reversed = reversed + input.charAt(i);

        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

    }
}