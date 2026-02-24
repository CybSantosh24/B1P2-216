/**
 * =====================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 6: Queue + Stack Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * Queue  -> FIFO (First In First Out)
 * Stack  -> LIFO (Last In First Out)
 *
 * Characters are inserted into both structures and
 * compared by removing from queue and stack.
 *
 * If all characters match → Palindrome.
 *
 * @author Developer
 * @version 6.0
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UC6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into Queue and Stack
        for(char c : input.toCharArray()) {

            queue.add(c);
            stack.push(c);

        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare Queue vs Stack
        while(!queue.isEmpty()) {

            if(queue.remove() != stack.pop()) {

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