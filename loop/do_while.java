import java.util.*;
public class do_while {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        do{
            System.out.println(n);
            n++;
        }while(n<=10);
    }
}
