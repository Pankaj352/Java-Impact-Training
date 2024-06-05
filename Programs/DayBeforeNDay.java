import java.util.Scanner;

public class DayBeforeNDay {

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the today's name like 0(Sunday) to 6(Saturday):");
        int day=scanner.nextInt();
        System.out.print("Enter the number of day before you want:");
        int numberOfDays=scanner.nextInt();
        int x=numberOfDays%7;
        int ans=day-x;
        if(ans>=0 && ans<=6){
        switch(ans) { 
            case 0:System.out.println("Sunday");
                break;  
            case 1:System.out.println("Monday");
                break; 
            case 2:System.out.println("Tuesday");
                break; 
            case 3:System.out.println("Wednesday");
                break; 
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break; 
            case 6:System.out.println("Saturday");
                break; 
            
        }

        }else{
            int ans2=ans+7;
            
            switch(ans2) { 
            case 0:System.out.println("Sunday");
                break;  
            case 1:System.out.println("Monday");
                break; 
            case 2:System.out.println("Tuesday");
                break; 
            case 3:System.out.println("Wednesday");
                break; 
            case 4:System.out.println("Thursday");
                break;
            case 5:System.out.println("Friday");
                break; 
            case 6:System.out.println("Saturday");
                break; 
            
        }
        }

    }
    
}
