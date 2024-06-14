public class ReverseIndex {
    public static void main(String[] args) {
        int[] arr = { 12, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(arr.length);
        int n = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
           if(i<=n/2) {
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
