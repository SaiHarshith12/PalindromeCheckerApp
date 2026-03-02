import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
                queue.add(str.charAt(i));
            }
            boolean isPalindrome = true;
            for (int i = 0; i < str.length(); i++) {
                if (!stack.pop().equals(queue.remove())) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }
