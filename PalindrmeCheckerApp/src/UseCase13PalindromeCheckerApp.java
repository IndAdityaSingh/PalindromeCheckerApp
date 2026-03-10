import java.util.Stack;

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
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

public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        PalindromeStrategy strategy = new StackStrategy();

        long startTime = System.nanoTime();
        boolean isPalindrome = strategy.check(input);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
        System.out.println("Execution Time: " + duration + " ns");
    }
}