/**
 * =====================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from outer positions
 * using recursive calls.
 *
 * Recursion stops when:
 * - All characters match
 * - A mismatch is found
 *
 * Demonstrates divide-and-conquer logic.
 *
 * @author Developer
 * @version 9.0
 */

public class UC9PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Call recursive method
        boolean result = checkPalindrome(input, 0, input.length() - 1);

        // Display result
        if(result) {

            System.out.println(input + " is a Palindrome");

        } else {

            System.out.println(input + " is NOT a Palindrome");

        }

    }

    /**
     * Recursive palindrome check
     */
    private static boolean checkPalindrome(String s, int start, int end) {

        // Base condition
        if(start >= end) {

            return true;

        }

        // Mismatch condition
        if(s.charAt(start) != s.charAt(end)) {

            return false;

        }

        // Recursive call
        return checkPalindrome(s, start + 1, end - 1);

    }

}