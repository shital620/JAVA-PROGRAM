import java.util.*;

public class day {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter choose number");
    int day=sc.nextInt();
    switch (day) {
        case 1:
        System.out.println("MONDAY");
             break;
             case 2:
        System.out.println("TUESDAY");
         break;
         case 3:
        System.out.println("WEDNESTDAY");
        break;
        case 4:
        System.out.println("THURSDAY");
        break;
        case 5:
        System.out.println("FRIDAY");
        break;
        case 6:
        System.out.println("saturday");
        break;
        case 7:
        System.out.println("SUNDAY");
    
        default:
        System.out.println("EXIT");
            break;
    }
 }    
}
