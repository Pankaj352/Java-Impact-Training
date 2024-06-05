public class patternOppositeTriangle {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=n;i++)
        {
            for(int j=0;j>=n;j--)
            {
                System.out.println(" ");
            }
            System.out.println("*");
        }
    }
}
