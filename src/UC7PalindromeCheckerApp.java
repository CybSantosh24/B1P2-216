/**
 * =====================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and compared
 * by removing elements from both ends:
 *
 * removeFirst()
 * removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * @author Developer
 * @version 7.0
 */

import java.util.Deque;
import java.util.ArrayDeque;

public class UC7PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "refer";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters into deque
        for(char c : input.toCharArray()) {

            deque.add(c);

        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare front and rear
        while(deque.size() > 1) {

            if(deque.removeFirst() != deque.removeLast()) {

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