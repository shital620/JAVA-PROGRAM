import java.util.*;
public class leap_year_or_not {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a year");
    int n=sc.nextInt();
    if (n%400==0) {
        System.out.println("it's a leap year, ");
    } else{
        System.out.println("it's  not a leap year, ");
    }
 }   
}
