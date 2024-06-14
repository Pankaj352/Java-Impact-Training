import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Mazda");

        cars.add(2,"Suzuki");
        System.out.println(cars.get(2));

        cars.set(0,"Jeep");

        System.out.println(cars);

        cars.remove(1);

        System.out.println(cars);
        
    }
}