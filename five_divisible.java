import java.util.*;
public class five_divisible{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a year");
    int n=sc.nextInt();
    if (n%5==0) {
        System.out.println("it's five divisible ");
    } else{
        System.out.println("it's  not five divisible, ");
    }
 }   
}
