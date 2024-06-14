public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {3, 4, 7, 10, 15, 18, 22, 29};
        int target = 4;
        int result = binarySearch(array, target);
        printResult(result, target);
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (target == array[mid]) {
                return mid;
            } else if (target < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void printResult(int result, int target) {
        if (result == -1) {
            System.out.printf("Element %d not found in array.%n", target);
        } else {
            System.out.printf("Element %d found at index %d.%n", target, result);
        }
    }
}