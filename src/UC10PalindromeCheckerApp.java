import java.util.Scanner;

public class UC10PalindromeCheckerApp {

    /**
     * Use Case 10: Normalized Palindrome Validation
     * Description:
     * This class validates palindrome after preprocessing the input string.
     * Normalization includes:
     * 1. Removing spaces and symbols
     * 2. Converting to lowercase
     * Example:
     * "A man a plan a canal Panama"
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Use Case 10: Normalized Palindrome Checker ===");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize string
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("It is a Palindrome ✅");
        } else {
            System.out.println("It is NOT a Palindrome ❌");
        }

        scanner.close();
    }

    /**
     * Checks palindrome by comparing characters
     */
    private static boolean checkPalindrome(String normalized) {

        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                return false;
            }
        }

        return true;
    }
}