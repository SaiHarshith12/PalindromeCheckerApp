import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = input.nextLine();

        String rev = "";

        for(int i = a.length() - 1; i >= 0; i--) {
            rev += a.charAt(i);
        }

        if(a.equalsIgnoreCase(rev)) {
            System.out.println("The string you entered is a palindrome");
        } else {
            System.out.println("The string you entered is not a palindrome");
        }
    }
}