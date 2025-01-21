import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст или слово");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println("is " + text + " a palindrome? " + validPalindrome(text));
        scan.close();
    }

    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }
        return true;
    }
}