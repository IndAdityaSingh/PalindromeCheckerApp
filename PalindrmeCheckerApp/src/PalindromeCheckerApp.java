package src;
/*
Use Case 01: Application Entry and Welcome Message

Description:
A Palindrome Checker app

At this stage the application:
-Starts execution form the main() method.
-Displays

@RA2411030010319 Developer
@Version 1.0
 */
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Assume it is a palindrome
        boolean isPalindrome = true;

        // Loop only till half the string length
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character from start with character from end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print true or false
        System.out.println(isPalindrome);

        scanner.close();
    }
}
