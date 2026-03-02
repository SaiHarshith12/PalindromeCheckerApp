import java.util.Scanner;
public class PalindromeCheckerApp {
        public static boolean isPalindrome(String str, int left, int right) {
            // Base case
            if (left >= right) {
                return true;
            }

            // If characters don't match
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            // Recursive call
            return isPalindrome(str, left + 1, right - 1);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.next();

            if (isPalindrome(input, 0, input.length() - 1)) {
                System.out.println("It is a Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }

            scanner.close();
        }
    }