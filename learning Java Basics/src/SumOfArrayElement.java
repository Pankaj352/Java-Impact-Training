public class SumOfArrayElement {
    public static void main(String[] args) {
//        an array of numbers
        int[] numbers = {3, 4,5 ,6 ,6,0, -23};
        int sum = 0;
//        Iterating through each element ;of the array
        for(int number : numbers){
            sum+=number;

        }
        System.out.println("Sum = "+ sum);
    }
}
