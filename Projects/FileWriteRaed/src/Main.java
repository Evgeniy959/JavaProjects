import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
           File file = new File("data.txt");
           try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("test1\n");
            fileWriter.write("test1\n");
            fileWriter.write("test1\n");
            fileWriter.write("test1");
            fileWriter.flush();
            fileWriter.close();


            FileReader fileReader = new FileReader(file);
            char[] text = new char[50];
            int c;
            /*while ((c=fileReader.read(text))!=-1){
                if(c < 50){
                    text = Arrays.copyOf(text, c);
                }
                String str = new String(text);
                System.out.println(str);
                System.out.println(text);
                //text = new char[50];
            }*/
               c=fileReader.read(text);
               if(c < 50){
                   text = Arrays.copyOf(text, c);
               }
               System.out.println(text);
            fileReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        try(FileReader reader = new FileReader("data.txt"))
//        {
//            // читаем посимвольно
//            int c;
//            while((c=reader.read())!=-1){
//
//                System.out.print((char)c);
//            }
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }
    }
}