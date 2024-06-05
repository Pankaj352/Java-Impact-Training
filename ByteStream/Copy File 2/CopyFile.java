package ByteStream;
import java.io.*;
public class CopyFile {
    public static void main(String agrs[])throws IOException {
        FileReader in=new FileReader("input.txt");
        FileReader out=new FileReader("output.txt");
        try{
            int c;
            while ((c = in.read()) != -1){
                in.write(c);
            }
            }finally{
                if(in!=null){
                    in.close();
                }
                if(out!=null){
                    out.close();
                }
        }
    }    
}
