import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = input.nextLine();
        boolean isPal = true;

        for(int i = 0; i < a.length() / 2; i++) {
            if (a.charAt(i) != a.charAt(a.length() - 1 - i)) {
                isPal = false;
                break;
            }
        }
        if(isPal) {
            System.out.println("The string you entered is a palindrome");
        } else {
            System.out.println("The string you entered is not a palindrome");
        }
    }
}