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
        String prefix = "";

        if (args.length == 0 || args[0].equals("-h")) {
            System.out.print(help);
            //System.out.println(str);
            return;
        }
        for (int i = 0; i < args.length; i++) {
            if ( args[i].equals("-o") /*&& i+1<=args.length*/) {
                String outputPath = args[i+1];
                System.out.println(str);
                if (i+2<args.length && args[i+2].equals("-a")) {
                    appendMode = true;
                    //if (args[i+3].equals("-o")) appendMode = true;
                }
                if (i+3<args.length && args[i+3].equals("-p") /*&& i+1<=args.length*/)
                    prefix = args[i+4];

                try(FileWriter writer = new FileWriter(outputPath + "/" + prefix + "integers.txt", appendMode))
                {
                    // запись всей строки
                    writer.write(str);
                    writer.flush();
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                    //System.out.println("Введите префикс имени файла");
                }
                catch(IndexOutOfBoundsException ex){

                    System.out.println(ex.getMessage());
                    System.out.println("Введите префикс имени файла");
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