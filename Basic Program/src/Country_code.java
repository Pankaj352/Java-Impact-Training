import java.util.Locale;
import java.util.Scanner;
public class Country_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Country Name :");
        String country_name = sc.nextLine();
        String country_code = country_name.toLowerCase(); //Convert String in to lowercase
        switch (country_code) {
            case "india": {
                System.out.println("Country code is +91 ");
                break;
            }
            case "usa": {
                System.out.println("Country code is +1 ");
                break;
            }
            case "italy": {
                System.out.println("Country code is +39 ");
                break;
            }
            case "spain": {
                System.out.println("Country code is +34 ");
                break;
            }

            case "afghanistan": {
                System.out.println("Country code is +93 ");
                break;
            }
            case "australia": {
                System.out.println("Country code is +61 ");
                break;
            }
            default: {
                System.out.println("Invalid Country Name.");
                break;
            }
        }
    }
}
