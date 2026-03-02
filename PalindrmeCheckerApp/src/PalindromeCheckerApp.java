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
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Déclarer et initialiser la chaîne d'entrée [cite: 78]
        String input = "noon";

        // Créer une pile (Stack) pour stocker les caractères [cite: 79, 80]
        Stack<Character> stack = new Stack<>();

        // 1. Pousser chaque caractère de la chaîne dans la pile (Push Operation) [cite: 51, 56, 81, 82]
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Supposer que c'est un palindrome au départ [cite: 83, 84]
        boolean isPalindrome = true;

        // 2. Parcourir à nouveau la chaîne originale et comparer avec les éléments sortis (Pop) [cite: 52, 57, 85, 86]
        for (char c : input.toCharArray()) {
            // Pop retire les caractères dans l'ordre inverse [cite: 57, 68]
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // 3. Afficher le résultat [cite: 53, 69]
        System.out.println("Input: " + input); // [cite: 89]
        System.out.println("Is Palindrome?: " + isPalindrome); // [cite: 90]
    }
}