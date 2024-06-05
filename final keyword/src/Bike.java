
//Final keyword in using method
public class Bike {
    final void run(){
        System.out.println("running");
    }
}
class honda extends Bike{
    void run(){
        System.out.println("Running safely with compile time");

    }

    public static void main(String[] args) {
        honda obj =new honda();
        obj.run();
    }
}
