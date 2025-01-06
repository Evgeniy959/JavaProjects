import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ArrayList<String> list = new ArrayList<String>();
        // Формируем список чисел от 0 до 9.
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        // Вставляем новый набор чисел от 0 до 5.
        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println("Изначальный список : " + list);
        System.out.println("\\nОтфильтрованный список без дубликатов : " + processList(list));
    }
    public static Set<String> processList(List<String> listContainingDuplicates) {
        final Set<String> resultSet = new HashSet<String>();
        final Set<String> tempSet = new HashSet<String>();
        for (String yourInt : listContainingDuplicates) {
            if (!tempSet.add(yourInt)) {
                resultSet.add(yourInt);
            }
        }
        return resultSet;
    }
}