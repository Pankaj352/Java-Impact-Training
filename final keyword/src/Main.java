// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

//final keyword in using variable
class Bike9{
    final int speedLimit=90; //final variable
    void run(){
        speedLimit=400;
    }
}
public class Main {
    public static void main(String[] args) {
        Bike9 obj=new Bike9();
        obj.run();
    }
}