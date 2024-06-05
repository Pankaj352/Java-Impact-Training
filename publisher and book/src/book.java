import java.sql.SQLOutput;
import java.util.Scanner;

public class book extends publisher {
    String book_name;
    int book_id;
    String Author_name;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter publisher name ");
        publisher_name = sc.next();
        System.out.println("Enter publisher id");
        publisher_id = sc.nextInt();
        System.out.println("Enter book name");
        book_name = sc.next();
        System.out.println("Enter book id");
        book_id = sc.nextInt();
        System.out.println("Enter author name");
        Author_name = sc.next();

    }
    void show_data()
    {
        System.out.println(publisher_name);
        System.out.println(publisher_id);
        System.out.println(book_name);
        System.out.println(book_id);
        System.out.println(Author_name);

    }
}

