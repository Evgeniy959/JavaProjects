package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FilterUtil {
    private static boolean appendMode = false;
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
            if (i+1<args.length && args[i].equals("-p") && args[i+1].equals("res")) {
                //String str = loadContent("in");
                System.out.println(str);
                if (args[i+2].equals("-a")) appendMode = true;
                try(FileWriter writer = new FileWriter(args[i+1] + "integers.txt", appendMode))
                {
                    // запись всей строки
                    writer.write(str);
                    writer.flush();
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }
                break;

            }
        }
    }
    public static String loadContent(String name) {
        try {
            var is = ClassLoader.getSystemResourceAsStream("input/" + name + ".txt");
            return new String(is.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException("Can't load file!");
        }
    }

    public static String raadFile(String name) {
        try {
            var is = ClassLoader.getSystemResourceAsStream("input/" + name + ".txt");
            return new String(is.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException("Can't load file!");
        }
    }
}