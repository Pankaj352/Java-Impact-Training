// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        byte[] array=new byte[100];
        try {
            InputStream input = new FileInputStream("test.txt");
            System.out.println("Available bytes in the file:" + input.available());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
}