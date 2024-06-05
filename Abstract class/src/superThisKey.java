class Base {
    int x; // Variable 'x' in base class
    void show() {
        System.out.println("Value of x in base class: " + x);
    }
}
// Subclass
class Sub extends Base {
    int x; // Variable 'x' in subclass

    void show() {
        super.show(); // Call show() in base class
        System.out.println("Value of x in subclass: " + x);
    }
}
// Main class
public class superThisKey {
    public static void main(String[] args) {
        Sub obj = new Sub();
        // Assign values to 'x' in both classes
        obj.x = 10; // 'x' in subclass
        obj.x = 20; // 'x' in base class
        obj.show(); // Call show() in subclass
    }
}
