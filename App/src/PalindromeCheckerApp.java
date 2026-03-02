import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {
                public static boolean isPalindrome(String str) {
                    Deque<Character> deque = new ArrayDeque<>();

                    // Insert characters into deque
                    for (int i = 0; i < str.length(); i++) {
                        deque.addLast(str.charAt(i));
                    }

                    // Compare front and rear
                    while (deque.size() > 1) {
                        char front = deque.removeFirst();
                        char rear = deque.removeLast();

                        if (front != rear) {
                            return false;
                        }
                    }

                    return true;
                }

                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("String to be checked: ");
                    String input = scanner.next();

                    if (isPalindrome(input)) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not a Palindrome");
                    }

                    scanner.close();
                }
            }