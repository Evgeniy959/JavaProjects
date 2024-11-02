import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        try(FileReader reader = new FileReader("notes3.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}