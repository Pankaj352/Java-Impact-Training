public class vehicle {
    String Brand;

    public void show_brand(){

        System.out.println("Brand:"+ Brand);
    }
}

class car extends vehicle{
    String model;
    String color;
    int mileage;

    public void get_car_data(String model,String color, int mileage){
        this.model=model;
        this.color=color;
        this.mileage=mileage;
    }
   public void  show_car(){
       System.out.println("Brand"+Brand);
       System.out.println("Model:" + model);
       System.out.println("Color"+ color);
       System.out.println("Mileage:"+mileage);
   }
}
class bike extends vehicle{
    String model;
    String color;
    int mileage;
    public void show_bike(){
        System.out.println("Brand"+Brand);
        System.out.println("Model:"+model);
        System.out.println("Color:"+color);
        System.out.println("Mileage:"+mileage);
    }
}