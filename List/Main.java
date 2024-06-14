import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Main{
    public static void main(String[] args) {
        List <Integer> num=new ArrayList<Integer>();
        num.add(12);
        num.add(299);
        num.add(32);
        num.add(42);
        num.add(2);
        Collections.sort(num);
        System.out.println(num);
        System.out.println("Print All element of List"+num);
        System.out.println("Length of list"+num.size());
        num.add(0,1);
        System.out.println("Insert Element at begning: "+ num);
        System.out.println("Accessing the first element: "+ num.get(0));
        System.out.println("Update the 2 index element : "+ num.set(2,25));
        System.out.println("After update the element: "+num);

        System.out.println("Removing the 3 index element of the list:  "+num.remove(3));
        System.out.println("After removing element from list: "+num);
        //clear all the element from the list

        

        for(int i=0;i<num.size();i++){
            System.out.println(num.get(i));
        }

        for(int number:num){
            System.out.println(number);
        }



        num.clear();
        System.out.println(num);

    }
}