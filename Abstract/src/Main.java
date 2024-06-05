// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
       Bike obj = new Honda4();
       obj.run();
    }
}
abstract class Bike{
    abstract void run();
}

class Honda4 extends Bike{
    void run(){
        System.out.println("running safely");
    }
}