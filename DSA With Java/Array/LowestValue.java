public class LowestValue {
    public static void main(String[] args) {
        int[] arr = {7, 12, 5, 7, 8, 9};
        int min = findLowestValue(arr);
        System.out.println("The lowest value in the array is: " + min);
    }

    public static int findLowestValue(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}