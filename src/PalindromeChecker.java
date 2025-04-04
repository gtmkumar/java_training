import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}