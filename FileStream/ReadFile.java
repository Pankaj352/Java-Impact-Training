import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File obj=new File("file.txt");
        Scanner reader=new Scanner(obj);
        while (reader.hasNextLine()) {
            String data=reader.nextLine();
            System.out.println(data);
        }
        reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
