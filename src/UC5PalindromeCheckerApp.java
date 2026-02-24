/**
 * =====================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This uses stack behavior for reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Stack;

public class UC5PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "noon";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for(char c : input.toCharArray()) {

            stack.push(c);

        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Pop and compare
        for(char c : input.toCharArray()) {

            if(c != stack.pop()) {

                isPalindrome = false;
                break;

            }

        }

        // Display result
        if(isPalindrome) {

            System.out.println(input + " is a Palindrome");

        } else {

            System.out.println(input + " is NOT a Palindrome");

        }

    }
}