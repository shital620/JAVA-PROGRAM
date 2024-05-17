import java.util.*;
public class absolute_number{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    if (n<0) {
        n=n*(-1);
    }
        System.out.println("it's absolute number is , "+n);

 }   
}
