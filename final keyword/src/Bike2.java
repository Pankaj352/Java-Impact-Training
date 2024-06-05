
//Final keyword in using class
final class Bike2 {}

class Honda2  extends Bike2{
    void run(){
        System.out.println("Running safely with 100kmph");
    }

    public static void main(String[] args) {
        honda2 obj=new honda2();
        obj.run();
    }
}
