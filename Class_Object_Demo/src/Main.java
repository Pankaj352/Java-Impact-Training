// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Class_Demo {
    int class_var1=50;
    float class_var2=3.14f;
    void method(){
        int method_var1=10;
        float method_var2=2.21f;
        System.out.println("class var 1:"+class_var1);
        System.out.println("class var 2:"+class_var2);
        System.out.println("method var 1:"+method_var1);
        System.out.println("method var 2:"+method_var2);
    }
    static class Class_Object_Demo {
        public static void main(String[] args) {
            Class_Demo obj1=new Class_Demo();
            obj1.method();
        }
    }
}