import java.util.Scanner;

public class palindromeCheckerApp {

    // Method to check palindrome
    public static boolean isPalindrome(String input) {
        // Remove spaces and convert to lowercase
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a word or sentence: ");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)) {
            System.out.println(" It is a palindrome!");
        } else {
            System.out.println(" It is NOT a palindrome.");
        }

        scanner.close();
    }
}