
/**
 * InnerMCA
 */ 
class InnerMCA {
    int x=10;
    int y=20;
    int add(){
        return x+y; 
    }
    int sub(){
        return x-y;
    }
    int mul(){
        return x*y;
    }
    int div(){
        return x/y;
    }
    int rem(){
        return x%y;
    }

}


public class MCA {
    void java(){
        System.out.println("Hello class");
    }
    void m1(){
        System.out.println("M1");
    }
    void m2(){
        System.out.println("M2");
    }
    void m3(){
        System.out.println("M3");
    }
    public static void main(String[] args) {
        InnerMCA obj=new InnerMCA();
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.div());
        System.out.println(obj.mul());
        System.out.println(obj.rem());
        System.out.println("Hello Sam!");

        
        MCA mcaObj=new MCA();
        mcaObj.java();
        mcaObj.m1();
        mcaObj.m2();
        mcaObj.m3();
    }
}