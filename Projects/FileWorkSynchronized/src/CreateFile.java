import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    static String text = "The first line.\n" +
            "This is the second line in the file.\n" +
            "Here is the third line.\n" +
            "And the fourth one.\n" +
            "And this is the fifth.\n" +
            "Line number 6.\n" +
            "Next odd line number 7.";
    static File folder = new File("test");
    public static void FileReader(){
        try {
            if (!folder.exists()) folder.mkdir();

            if (folder.isDirectory()) {
                System.out.println(folder.getName() + " is directory");

                File file = new File(folder.getAbsolutePath() + "/lines.txt");

                if (!file.exists()) {
                    file.createNewFile();
                }
                if (file.isFile()) {

                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(text + System.getProperty("line.separator"));
//                    fileWriter.write("Text2\n");
//                    fileWriter.write("Text3\n");
//                    fileWriter.write("Text4\n");
//                    // fileWriter.flush();
//                    //System.in.read();
//                    fileWriter.write("Text5\n");
//                    fileWriter.write("Text6\n");
//                    // fileWriter.flush();
                    fileWriter.close();
                }
            }
            //folder.delete();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void FileOut(){
        try {
                File file = new File(folder.getAbsolutePath() + "/lines_out.txt");

                if (!file.exists()) {
                    file.createNewFile();
                }
//                if (file.isFile()) {
//
//                    FileWriter fileWriter = new FileWriter(file);
//                    fileWriter.write("test"+System.getProperty("line.separator"));
////                    fileWriter.write("Text2\n");
////                    fileWriter.write("Text3\n");
////                    fileWriter.write("Text4\n");
////                    // fileWriter.flush();
////                    //System.in.read();
////                    fileWriter.write("Text5\n");
////                    fileWriter.write("Text6\n");
////                    // fileWriter.flush();
//                    fileWriter.close();
//                }
            //}
            //folder.delete();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
