package org.example;

import java.io.IOException;

public class FilterUtil {
    public static void main(String[] args) {
        final String help = String.format("FilesFilter [options] [files...]%n" +
                "options:%n" +
                "-o <путь>     Путь до файлов с результатом.%n" +
                "-p <префикс>  Префикс имён файлов с результатом.%n" +
                "-a            Режим записи в конец файла.%n" +
                "-s            Краткая статистика.%n" +
                "-f            Полная статистика.%n");

        String str = loadContent("in");

        if (args.length == 0 || args[0].equals("-h")) {
            System.out.print(help);
            //System.out.println(str);
            return;
        }
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-p")  && !args[i+1].equals("res") && i+1<args.length) {
                //String str = loadContent("in");
                System.out.println(str);
                break;

            }
        ;
        }
    }
    public static String loadContent(String name) {
        try {
            var is = ClassLoader.getSystemResourceAsStream("reading/" + name + ".txt");
            return new String(is.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException("Can't load message!");
        }
    }
}