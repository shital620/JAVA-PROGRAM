import java.util.*;
public class evenwithcondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if (n%2==0&&n%3==0) {

            System.out.println("the even number"+n);
            
        }
    }
}
