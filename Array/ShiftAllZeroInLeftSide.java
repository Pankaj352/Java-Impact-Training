public class ShiftAllZeroInLeftSide {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0, 6, 0, 7, 0, 8, 0 };
        int n = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i <= n / 2 && arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[n - i];
                arr[n - i] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
