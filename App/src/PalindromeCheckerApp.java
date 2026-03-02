import java.util.Scanner;
    interface PalindromeStrategy {
        boolean isPalindrome(String input);
    }
    class IterativePalindrome implements PalindromeStrategy {
        @Override
        public boolean isPalindrome(String input) {
            String str = input.toLowerCase().replaceAll("[^a-z0-9]", "");

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
    class RecursivePalindrome implements PalindromeStrategy {

        @Override
        public boolean isPalindrome(String input) {
            String str = input.toLowerCase().replaceAll("[^a-z0-9]", "");
            return check(str, 0, str.length() - 1);
        }
        private boolean check(String str, int left, int right) {
            if (left >= right) {
                return true;
            }

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            return check(str, left + 1, right - 1);
        }
    }
    class PalindromeContext {

        private PalindromeStrategy strategy;

        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }
        public boolean execute(String input) {
            if (strategy == null) {
                throw new IllegalStateException("Strategy not set!");
            }
            return strategy.isPalindrome(input);
        }
    }
    public class PalindromeCheckerApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            PalindromeContext context = new PalindromeContext();
            System.out.println("Choose Algorithm:");
            System.out.println("1. Iterative");
            System.out.println("2. Recursive");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (choice == 1) {
                context.setStrategy(new IterativePalindrome());
            }
            else if (choice == 2) {
                context.setStrategy(new RecursivePalindrome());
            }
            else {
                System.out.println("Invalid choice!");
                scanner.close();
                return;
            }
            boolean result = context.execute(input);
            if (result) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
            scanner.close();
        }
    }
