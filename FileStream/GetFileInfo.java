import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File obj=new File("filename.txt");
        if(obj.exists()){
            System.out.println("File Name: "+obj.getName());
            System.out.println("Absolute Path: "+ obj.getAbsolutePath());
            System.out.println("Writeable: "+ obj.canWrite());
            System.out.println("Readable: "+ obj.canRead());
            System.out.println("File size in bytes: "+ obj.length());
            System.out.println("Execution check: "+obj.canExecute());
        }else{
            System.out.println("The file does not exist.");
        }
    }
}
