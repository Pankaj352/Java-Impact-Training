import java.util.LinkedList;
class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList<String> cars=new LinkedList();

        //add element at random index in list
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Jeep");
        cars.add("MG");
        System.out.println(cars);

        //Add element at first position
        cars.addFirst("Suzuki");
        System.out.println(cars);

        //Add element at Last position
        cars.addLast("KIA");
        System.out.println(cars);

        //Add element at given index
        cars.add(2,"TATA");

        //remove first element
        cars.removeFirst();
        System.out.println(cars);

        //remove Last element
        cars.removeLast();
        System.out.println(cars);

        //remove the given index
        cars.remove(3);
        System.out.println(cars);


        //Get the first element of the list
        System.out.println(cars.getFirst());

        //Get the last element of the list
        System.out.println( cars.getLast());
        
        //Get the element at the given index
        System.out.println(cars.get(3));

    }
}