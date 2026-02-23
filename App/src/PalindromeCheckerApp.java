import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = input.nextLine();
        int left=0;
        int right=a.length()-1;
        String b="";
        String c="";
        if(a.length()%2!=0) {
            for (int i = left; i <= a.length() / 2; i++) {
                b += a.charAt(i);
            }
            for (int j = right; j >= a.length() / 2; j--) {
                c += a.charAt(j);
            }
        }
        else{
            for (int i = left; i < a.length() / 2; i++) {
                b += a.charAt(i);
            }
            for (int j = right; j >= a.length() / 2; j--) {
                c += a.charAt(j);
            }
        }
        if(b.equalsIgnoreCase(c)) {
            System.out.println("The string you entered is a palindrome");
        } else {
            System.out.println("The string you entered is not a palindrome");
        }
    }
}