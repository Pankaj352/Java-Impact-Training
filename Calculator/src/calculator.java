public class calculator {
    void add(int a, int b){
        System.out.println( "Addition of a and b: "+a+b);
    }
    void sub(int a, int b){
        System.out.println("Subtraction of a and b: "+(a-b));
    }
    void mul(int a, int b){
        System.out.println( "Multiplication of a and b: "+(a*b));
    }
    void div(int a, int b){
        System.out.println( "Division of a and b: "+(a/b));
    }
    void reminder(int a, int b){
        System.out.println("Modulo/Reminder of a and b: "+(a%b));
    }
    void percentage(int a, int b){
        //where a is your obtain marks and b is total
        System.out.println("Division of a and b: "+(a/b*100));
    }
}
