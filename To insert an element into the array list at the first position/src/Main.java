import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<String> list_arr=new ArrayList<String>();
        list_arr.add("TATA");
        list_arr.add("VOLVO");

        list_arr.add(0,"KIA");
        System.out.println(list_arr);
    }
}