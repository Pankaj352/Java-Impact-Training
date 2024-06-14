public class PrintArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,32,2,3,5,433,5,53,33};
        //using for each loop
        for(int value:arr){
            System.out.println(value);
        }
        // using for loop
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
