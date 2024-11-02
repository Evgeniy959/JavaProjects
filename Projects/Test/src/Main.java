import javax.xml.validation.Schema;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    static char Min(char[] array)
    {
        char min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (min > array[i]) min = array[i];
        }
        return min;
    }
    static char Max(char[] array)
    {
        char max = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i]) max = array[i];
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int count=0;
        for (int i=2; i<20; i++){
            if(i%2!=0||i==2){
                count++;
                System.out.print(i+", ");
            }
        }
        System.out.println();
        System.out.println(count);
        /*List<Character> str = new ArrayList<>(){};
        List<Character> listRes = new ArrayList<>(){};

        str.add('f');
        str.add('r');
        str.add('s');
        str.add('g');
        str.add('m');
        str.add('x');
        str.add('a');
        str.add('b');
        str.add('c');
        str.add('d');
        str.add('.');
        str.add('-');
        str.add('5');
        int size = str.size();*/



        //char[] str = {'f','i','u','e','w', 'w', '/', 'a','m','a'};
        //char[] str1 = new char[str.length];
        /*for (int i=0; i<size; i++){
            Character min = Collections.min(str);
            listRes.add(min);
            str.remove(min);

        }*/

        // Второй способ:
        /*while (str.size()!=0){
            Character min = Collections.min(str);
            listRes.add(min);
            str.remove(min);
        }*/
        Character[] str = {'f','i','u','e','w', 'w', '.', 'a','m','a'};
        //List<Character> list = Arrays.asList(str);
        List<Character> list = new ArrayList<>(){};
        Collections.addAll(list, str);
        List<Character> listRes = new ArrayList<>(){};
        //char[] str1 = new char[str.length];
        Collections.sort(list);
        System.out.println(list);

        // Второй способ:
        while (list.size()!=0){
            Character min = Collections.min(list);
            listRes.add(min);
            list.remove(min);
        }
        System.out.println(listRes);

//        char[] str = {'f','i','u','e','w', 'w', 'a','m','a'};
//        char[] str1 = new char[str.length];
        /*for (int i=0; i<str1.length; i++){
            char min = Min(str);
            str1[i]=min;
            str.
        }
//        for (int i=0; i<str1.length; i++){
//            while (str1.length<=str.length){
//                if (str[i]<str[i+1])
//                    str1[i]=str[i];
//                else str1[i]=str[i+1];
//            }
//        }
        System.out.println(str1);*/

        /*char[] str = {'f','i','u','e','w', 'w', 'a','m','a'};
        for (int j=str.length-1; j>0; j--){
            {
                for (int i=0; i<j; i++){

                    if (str[i]>str[i+1]){
                        char temp = str[i];
                        str[i]=str[i+1];
                        str[i+1]=temp;
                    }

                }

            }
        }
        System.out.println(str);*/
        int arr[] ={3,5,5,6,7,2,3,7};
        int max = 0;
        for (int x: arr) {
            if (x>max) max=x;
        }
        System.out.println(max);

        System.out.println(Pattern.matches("^[а-яёa-z]*[А-ЯЁA-Z]{1}[а-яёa-z]*$","яблоКо"));
        //Pattern pattern = Pattern.compile("abc");
        System.out.println(Pattern.compile("Три богатыря"));

        //Сортировка подсчётом

        char[] chars = {'f','i','u','e','w', 'w', '.', 'a','m','a'};
        //char[] chars1 = new char[256];
        char minC = Min(chars);
        char maxC = Max(chars);
        char[] chars1 = new char[maxC+1];
        //System.out.println(maxC);
        int j = 0;
        /*for (int i=minC; i<=maxC; i++){
            chars1[i]=0;
        }*/
        for (int i=0; i<chars.length; i++){
            chars1[chars[i]]+=1;
        }
        for (int i=minC; i<=maxC; i++){
            while (chars1[i] > 0) {
                // добавляем номер ячейки в исходный массив
                chars[j] = (char) i;
                // переходим к следующему элементу в исходном массиве
                j++;
                // уменьшаем на единицу содержимое ячейки в массиве с подсчётом
                chars1[i]--;
            }
        }
        System.out.println(chars);

        String hello = "hello";
        String helloBack = "hell";
        helloBack+="o";

        System.out.println(hello==helloBack);

//        int counter = 0;
//        counter = counter+1;counter-=1;
//        counter++;
//        counter = counter+ 2*counter;
//        counter-=counter;
//        counter=counter+/*500*/+1;
//        counter++;
//
//        System.out.printf("Counter value is %s", counter);

        char letter = 97;
        char letter2 = 'b';
        System.out.printf("%c%c", capitlize(letter), capitlize(letter2));
        System.out.println();

        double d = 1.1;
        float f = 2.2F;
        f= (float)d*2;
        System.out.printf("%.1f", f);
        System.out.println();

        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        int max1 = 0;
        if(a>b) max1=a; else max1=b;
        //if(a.compareTo(b) < 0) max1=a; else max1=b;

        System.out.printf("Maximum between %d and %d is %d", a, b, max1);
        System.out.println();

        String s1 = "hello";
        String s2 = "hell";
        s2+="o";

        System.out.println(s1.compareTo(s2));
        System.out.println(compareStrings(s1, s2));
        System.out.println(compareStrings2(s1, s2));

        int counter = 0;
              counter = counter+1;counter-=1;
        counter++;
              counter=counter + 2*counter;
              counter-=counter;
        counter=counter+/*500*/+1;
              counter++;

              System.out.printf("Counter value is %s", counter);

        System.out.println();

        Integer a1 = 10000;
        Integer b1 = 10000;
        Integer c = 100;
        Integer d1 = 100;
        int e = 10000;
        int f1 = 100;

            System.out.printf("%b %b %b %b %b %b", a1==e, b1==e, a1==b1, c==f1, d1==f1, c==d1);
        System.out.println();
        System.out.printf("%d", b1);
        System.out.println();
            System.out.printf("%s", returnSum(2, 5));
        System.out.println();
        System.out.println(returnSum('s', 6));

        class SchemaComparator<Schema> implements Comparator<Schema>{

            @Override
            public int compare(Schema o1, Schema o2){
                System.out.printf("Counter value is %s", 2);
                return 0;
            }
        }
        SchemaComparator sh= new SchemaComparator<Schema>();
        sh.compare(2, 5);


    }
    public static char capitlize(char letter){
        return letter-=32;
    }

    public static boolean compareStrings(String s1, String s2) {return s1==s2;}

    public static boolean compareStrings2(String s1, String s2) {
        return s1.equals(s2);
    }

    public static int returnSum(String a, String b){
        return Integer.parseInt(a+b);
    }
    public static String returnSum(int a, int b){
        return String.valueOf(a+b);
    }
    public static char returnSum(char a, int b){
        return (char)(a+b);
    }
//    public static long returnSum(int a, int b){
//        return a+b;
//    }



//    class Player2D{
//   private int x,y;
//
//           public void moveTo2D(int x1, int y1){
//                  x=x1;
//                  y=y1;
//               }
//   public int[] getDistance(int x1, int y1){
//                  return new int[]{x1-x, y1-y};
//               }
// }
//final class Player3D extends Player2D{
//   private int z;
//
//           public void moveTo3D(int x1, int y1, int z1){
//                  moveTo2D(x1,y1);
//                  z=z1;
//               }
//   public int[] getDistance(int x1, int y1,int z1){
//                  return new int[]{x1-x, y1-y,z1-z};
//               }
// }
//class Player4D extends Player3D{
//   public void moveTo4D(int x1,int y1, int z1, int t1){
//                  int[] distance = parent.getDistance(x1,y1,z1);
//                  for(int i=0;i<t1;i++){
//                         moveTo3D(x1: x1-distance[0]*(1-i/t1),y1:y1-distance[1]*(1-i/t1),z1:z1-distance[3]*(1-i/t1));
//                      }
//               }
 //}

}