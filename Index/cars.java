public class cars{
    public static void main(String[] args) {
        String[] carNames = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(carNames[0]);

        carNames[0]="Opel";//change the array element whose index is 0
        System.out.println(carNames[0]);
    }
}