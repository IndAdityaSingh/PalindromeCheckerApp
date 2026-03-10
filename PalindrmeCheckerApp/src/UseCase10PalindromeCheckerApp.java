package src;

import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine(); // Example: "A man a plan a canal Panama"

        // 1. Normalize string: Remove spaces/symbols and convert to lowercase [cite: 6, 17, 18, 19]
        // Regular expression [^a-zA-Z0-9] replaces all non-alphanumeric characters [cite: 9]
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // 2. Apply logic: Compare characters from both ends [cite: 7, 32]
        for (int i = 0; i < normalized.length() / 2; i++) { [cite: 33]
            // Compare symmetric characters [cite: 35]
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) { [cite: 36]
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome?: " + isPalindrome); [cite: 40]

        scanner.close();
    }
}