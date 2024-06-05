public class PyramidPattern {
    public static void main(String[] args) {
        int n=8;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                 if(i>=j){
                     System.out.print(i + " ");
                 }
                 else {
                     System.out.print(" ");
                 }
            }
            System.out.println();
        }

    }
}
