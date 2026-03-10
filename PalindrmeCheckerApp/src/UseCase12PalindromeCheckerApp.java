package src;

import java.util.Stack;

interface UseCase11 {
    boolean check(String input);
}

class StackStrategy implements UseCase11 {
    @Override
    public boolean check(String input) {
        String data = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : data.toCharArray()) {
            stack.push(c);
        }

        for (char c : data.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        UseCase11 strategy = new StackStrategy();
        boolean isPalindrome = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}