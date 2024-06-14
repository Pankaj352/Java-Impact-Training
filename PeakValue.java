public class PeakValue {
    public static void main(String[] args) {
        int[] arr={12,20,30,40,10};
        System.out.println("Hello");
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
