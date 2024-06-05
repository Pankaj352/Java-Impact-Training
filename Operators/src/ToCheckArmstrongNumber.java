public class ToCheckArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int result=0;
        int r;
        int temp=n;
        int cube;
        while(temp>0){
            r=temp%10;
            cube=r*r*r;
            result=result+cube;
            temp=temp/10;
        }
        System.out.println(result);
    }
}
