import java.io.FileOutputStream;

public class Byte {
    public static void main(String[] args) {
        try {
            FileOutputStream fo=new FileOutputStream("bytefile.txt");
            String str="Welcome to Parul";
            byte b[]=str.getBytes();
            fo.write(b);
            fo.close();
            System.out.println("Data save in file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
