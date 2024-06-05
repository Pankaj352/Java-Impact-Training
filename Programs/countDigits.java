import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        
        int count=0;
        while(x>0){
            x/=10;
            count+=1;
            
        }
        System.out.println(count);
    }
}
