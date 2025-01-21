import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите текст : ");
        System.out.println(textModifier());
    }

    public static String textModifier() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        StringBuilder sb = new StringBuilder();
        String[] words = input.split(" ");
        for(String word : words){
            if (!word.isEmpty())
                sb.append(word).append(" ");
        }
        String str = sb.toString();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '-'){
                char temp = chars[i-1];
                chars[i-1] = chars[i+1];
                chars[i+1] = temp;
            }
        }
        str = String.valueOf(chars).replace("-", "").replace("+", "!");
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)){
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        str = str.replaceAll("\\d", "").trim();
        if (sum != 0) str += " " + sum;
        return str;
    }
}