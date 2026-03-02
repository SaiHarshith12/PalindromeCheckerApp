import java.util.Scanner;
public class PalindromeCheckerApp {
    public static boolean iterativePalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static boolean recursivePalindrome(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return recursivePalindrome(str, left + 1, right - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        long start1 = System.nanoTime();
        boolean result1 = iterativePalindrome(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        long start2 = System.nanoTime();
        boolean result2 = recursivePalindrome(cleaned, 0, cleaned.length() - 1);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        System.out.println("\nIterative Time: " + time1 + " ns");
        System.out.println("Recursive Time: " + time2 + " ns");

        if (time1 < time2)
            System.out.println("Iterative is faster.");
        else
            System.out.println("Recursive is faster.");

        sc.close();
    }
}
