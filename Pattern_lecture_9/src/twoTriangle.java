public class twoTriangle {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        for(int i=0;i<3;i++)
        {
            System.out.println();
            for(int j=0;j<3;j++)
            {
                if(i==j || i>j)
                    System.out.print("*");
            }

        }

    }
}
