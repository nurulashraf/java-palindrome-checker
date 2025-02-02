package palindromechecker;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a string or number: ");
            String userInput = input.nextLine().trim();

            if (userInput.isEmpty()) {
                throw new IllegalArgumentException("Input cannot be empty.");
            }

            if (isPalindrome(userInput)) {
                System.out.println("The input is a palindrome.");
            } else {
                System.out.println("The input is not a palindrome.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lowercase
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
