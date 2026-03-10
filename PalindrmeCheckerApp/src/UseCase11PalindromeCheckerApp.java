package src;

import java.util.LinkedList;


public class UseCase11PalindromeCheckerApp {


    public static void main(String[] args) {
        // Create an instance of the service class [cite: 6]
        PalindromeService service = new PalindromeService();

        // Example input as shown in the documentation
        String input = "racecar";

        // Expose and call the checkPalindrome() method [cite: 6]
        boolean result = service.checkPalindrome(input);

        // Output formatting [cite: 42, 43]
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {
        // Initialize pointers [cite: 35, 36, 37, 38]
        int start = 0;
        int end = input.length() - 1;

        // Iterative comparison logic [cite: 39]
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