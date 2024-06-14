public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,4, 5,6,9,10,12,15}; 
        int start=arr[0];
        int end=arr.length-1;
        int target=15;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                target=arr[mid];
            }else if(target>arr[mid]){
                start=arr[mid]+1;
            }else{
                end=arr[mid]-1;
            }
        }

        System.out.println();
    }
}
