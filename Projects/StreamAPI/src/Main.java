import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //5) Из коллекции имен убрать все повтарения и найти среднюю длину имен;
        List<String> average = new ArrayList<>(){};
        average.add("Tom");
        average.add("Nik");
        average.add("Jon");
        average.add("Alex");
        average.add("Evgeniy");
        average.add("Alex");
        average.add("Tom");
        List<String> resultAve = average.stream().distinct().collect(Collectors.toList());
        System.out.println(resultAve);
        List<String> resAve = average.stream().distinct().flatMap(s-> Arrays.stream(s.split(""))).collect(Collectors.toList());
        System.out.println(resAve);
        System.out.println(resAve.size()/resultAve.size());
    }
}