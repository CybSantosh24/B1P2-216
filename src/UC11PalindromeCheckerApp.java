import java.util.Scanner;

/**
 * Use Case 11: Object-Oriented Palindrome Service
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 *
 * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 *
 * Author: Developer
 * Version: 11.0
 */

public class UC11PalindromeCheckerApp {

    /**
     * Application entry point for UC11
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Use Case 11: OOP Palindrome Checker ===");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create object of service class
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}


/**
 * Service class that contains palindrome logic
 */
class PalindromeService {

    /**
     * Checks whether input string is palindrome
     */
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        // Compare characters from both ends
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