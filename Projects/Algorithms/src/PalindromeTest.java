public class PalindromeTest {
    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }
        return true;
    }
    public static void validPalindrome2(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                System.out.println("is " + s + " a palindrome? " + false);
                //return false;
                return;
            }
        }
        System.out.println("is " + s + " a palindrome? " + true);
        //return true;
    }
    private static boolean isAlphanumeric(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }

    public static void validPalindromeIgnorePunctuation(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {

            while (j >= 0 && !isAlphanumeric(s.charAt(j))) j--;
            while (i < s.length() && !isAlphanumeric(s.charAt(i))) i++;

            if (i >= j) {
                System.out.println("is " + s + " a palindrome? " + true);
                return;
                //return true;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                System.out.println("is " + s + " a palindrome? " + false);
                return;
                //return false;
            }
        }
        System.out.println("is " + s + " a palindrome? " + true);
        //return true;
    }

}
