import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(textModifier());
    }

    public static String textModifier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        scanner.close();

        // Удаление лишних пробелов в тексте
        StringBuilder modifiedText = new StringBuilder();
        boolean spaceDetected = false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (!spaceDetected) {
                    modifiedText.append(text.charAt(i));
                }
                spaceDetected = true;
            } else {
                modifiedText.append(text.charAt(i));
                spaceDetected = false;
            }
        }

        // Замена нами символов вокруг знака "-"
        StringBuilder swappedText = new StringBuilder();
        for (int i = 0; i < modifiedText.length(); i++) {
            if (modifiedText.charAt(i) == '-') {
                swappedText.append(modifiedText.charAt(i + 1));
                swappedText.append(modifiedText.charAt(i - 1));
                i++;
            }
            else if (i+1 <= modifiedText.length()-1 && modifiedText.charAt(i+1) != '-'){
                swappedText.append(modifiedText.charAt(i));
            }
            else if (i == modifiedText.length()-1) swappedText.append(modifiedText.charAt(i));

        }

        // Заменим "+" на "!"
        String replacedText = swappedText.toString().replace('+', '!');

        // Вычисление суммы цифр и их удаление
        int sum = 0;
        String finalText = "";
        for (int i = 0; i < replacedText.length(); i++) {
            char c = replacedText.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            } else {
                finalText += c;
            }
        }
        finalText += " " + sum;
        return finalText;

    }
}