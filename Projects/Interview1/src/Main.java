import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Необходимо написать метод, который принимает два числа в качестве аргументов
//        и возвращает строку с информацией о том, какое число больше - первое, второе или они равны.
//                Затем в main считать из консоли два числа от пользователя
//        и вызвать метод с этими значениями и вывести результат в консоль.
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(numberInfo(a, b));

    }

    public static String numberInfo(int a, int b) {
        String str = "";
        if (a>b)
            return String.format("%d больше %d", a, b);
        if (a<b)
            return "a<b";
        return "a=b";
    }
}