import java.util.Scanner;
class palindrome {
    private String cleanString(String input) {
        return input.toLowerCase().replaceAll("[^a-z0-9]", "");
    }

    public boolean isPalindrome(String input) {
        String str = cleanString(input);
        int left = 0;
        int right = str.length() - 1;

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
public class PalindromeCheckerApp {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            palindrome service = new palindrome();

            System.out.print("Enter a string to be checked: ");
            String input = scanner.nextLine();

            boolean result = service.isPalindrome(input);

            if (result) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }

            scanner.close();
        }
    }
