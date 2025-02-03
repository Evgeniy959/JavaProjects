import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class FilterUtil {
    public static void main(String[] args) throws IOException {

        //List<String> lines = Files.readAllLines(Paths.get("D:\\D Aser\\Test2\\Java\\JavaProjects\\Projects\\FileFilterUtil\\src\\input\\in1.txt"), UTF_8);
        List<String> lines = Files.readAllLines(Paths.get("src/input/in1.txt"), UTF_8);
        for (String s: lines) {
            System.out.println(s + "-" + isFloat(s.trim()));
            //System.out.println(isFloat(s.trim()));
        }
        System.out.println(lines.get(1));
        long b = Long.parseLong(lines.get(1).trim());
        int a = Integer.parseInt("45");
        float f = Float.parseFloat(lines.get(1).trim());
        System.out.println(b);
        System.out.println(a);
        System.out.println(f);
    }

    public static boolean isInteger(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isFloat(String s) {
        try {
            Float.parseFloat(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

//    public static List<String> loadText() throws IOException {
//        List<String> lines = Files.readAllLines(Paths.get("D:\\D Aser\\Test2\\Java\\JavaProjects\\Projects\\FileFilterUtil\\src\\input\\in1.txt"), UTF_8);
//        return lines;
//    }
}