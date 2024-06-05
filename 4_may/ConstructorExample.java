public class ConstructorExample {
    int id;
    String name;
    ConstructorExample(int id, String name){
        this.id = id;
        this.name = name;
        
    }

    void display(){
        System.out.println("========================================");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("========================================");
    }
    public static void main(String[] args) {
        ConstructorExample obj=new ConstructorExample(1, "Sam");
        ConstructorExample obj1=new ConstructorExample(1, "Harshit");
        obj.display();
        obj1.display();
    }
}
