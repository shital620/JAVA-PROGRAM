import java.util.*;
public class even_odd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        if (n%2==0) {
System.out.print("number is even");            
        }else{
            System.out.println("number is odd");
        }
    }
}