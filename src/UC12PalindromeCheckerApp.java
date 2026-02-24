/**
 * MAIN CLASS Checker
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Pattern.
 *
 * Author: Developer
 * Version: 12.0
 */

public class UC12PalindromeCheckerApp {

    /**
     * Application entry point for UC12
     */
    public static void main(String[] args) {

        String input = "madam";

        // Choose strategy at runtime
        PalindromeStrategy strategy;

        // Try Stack Strategy
        strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Using Stack Strategy");
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);

        // Try Deque Strategy
        strategy = new DequeStrategy();

        result = strategy.check(input);

        System.out.println("\nUsing Deque Strategy");
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }
}


/**
 * INTERFACE Strategy
 * Defines contract for palindrome algorithms
 */
interface PalindromeStrategy {

    boolean check(String input);
}


/**
 * CLASS StackStrategy
 * Implements palindrome validation using Stack
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare with pop
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


/**
 * CLASS DequeStrategy
 * Implements palindrome validation using Deque
 */
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Deque<Character> deque =
                new java.util.ArrayDeque<>();

        // Insert characters
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and rear
        while (deque.size() > 1) {

            if (deque.removeFirst()
                    != deque.removeLast()) {

                return false;
            }
        }

        return true;
    }
}