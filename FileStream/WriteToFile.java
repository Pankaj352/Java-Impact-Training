import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("filename.txt");
            writer.write("This file is related to FileStream package.");
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
