import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Сортировка подсчётом

        Character[] chars = {'f','i','u','e','w', 'w', '.', 'a','m','a'};
        char[] charS = {'f','i','u','e','w', 'w', '.', 'a','m','a'};
        Stream<Character> str = Arrays.stream(chars);
        Optional<Character> min=str.min(Character::compare);
        System.out.println(min.get());
        //System.out.println((str.min(Character::compare)).get());
        List<Character> list = Arrays.asList(chars);
        char minC = Collections.min(Arrays.asList(chars));
        char maxC = Collections.max(Arrays.asList(chars));
        char[] chars1 = new char[maxC+1];
        char[] chars2 = new char[chars.length];
        //System.out.println(maxC);
        int j = 0;
        /*for (int i=minC; i<=maxC; i++){
            chars1[i]=0;
        }*/
        for (int i=0; i<chars.length; i++){
            chars1[chars[i]]+=1;
        }
        System.out.println(chars1);
        for (int i=minC; i<=maxC; i++){
            while (chars1[i] > 0) {
            //if (chars1[i] != 0) {
                // добавляем номер ячейки в исходный массив
                chars2[j] = (char) i;
                // переходим к следующему элементу в исходном массиве
                j++;
                // уменьшаем на единицу содержимое ячейки в массиве с подсчётом
                chars1[i]--;
            }
        }
        System.out.println(chars2);

        //----------------------------------------------------
        boolean numbFlag = true;
        for (int num = 2; num <= 25; num++)
        {
            for (int i = 2; i <= (int)(Math.sqrt(num)); i++)
            {
                if (num % i == 0)
                {
                    numbFlag = false;
                    break;
                }
                //else numbFlag = true;

            }
            if (numbFlag)
            {
                //System.out.print(num + ",");
                System.out.printf("%d,", num);
            }
            else numbFlag = true;
        }
        System.out.println();
// 2 способ -----------------------------------
        for (int p = 1; p < 25; p++) {
            int k = 0;
            for (int i = 1; i <= p/2; i++) {
                if (p % i == 0) {
                    k++;
                }

            }
            if (k == 1) {
                System.out.print(p + " ");
            }
        }
        System.out.println();
        // с методом
        for (int p = 1; p < 25; p++) {
            if (IsPrimeNumber(p))
            System.out.print(p + " ");
        }

    }
    static boolean IsPrimeNumber(int n){
        int k = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                k++;
            }

        }
        if (k == 1) {
            return true;
        }
        return false;

    }
}