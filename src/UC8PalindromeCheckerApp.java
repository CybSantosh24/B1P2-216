/**
 * =====================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and compared by
 * removing elements from both ends:
 *
 * removeFirst()
 * removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.LinkedList;

public class UC8PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define input string
        String input = "level";

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for(char c : input.toCharArray()) {

            list.add(c);

        }

        // Assume palindrome
        boolean isPalindrome = true;

        // Compare first and last
        while(list.size() > 1) {

            if(list.removeFirst() != list.removeLast()) {

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