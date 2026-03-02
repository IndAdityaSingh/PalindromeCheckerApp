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
        // Déclaration et initialisation de la chaîne d'entrée [cite: 33, 34]
        String input = "radar";

        // 1. Conversion de la chaîne en tableau de caractères (char[]) [cite: 6, 35, 36]
        char[] chars = input.toCharArray();

        // 2. Initialisation des pointeurs (Technique Two-Pointer) [cite: 7, 12]
        int start = 0; // Début du tableau [cite: 37]
        int end = chars.length - 1; // Fin du tableau [cite: 39]

        // Variable pour stocker le résultat [cite: 40, 41]
        boolean isPalindrome = true;

        // 3. Boucle de comparaison jusqu'à ce que les pointeurs se croisent [cite: 42]
        while (start < end) {
            // Comparaison des caractères aux positions start et end [cite: 8, 21]
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Sortie immédiate si une différence est trouvée
            }
            // Déplacement des pointeurs vers le centre
            start++;
            end--;
        }

        // 4. Affichage du résultat [cite: 21, 44, 45]
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
