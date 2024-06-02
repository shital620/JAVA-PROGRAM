import java.util.*;

public class even1 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if (num%2==0|| num%3==0||num%5==0) {
            System.out.println("even"+ num);
            
        } else{
            System.out.println("not Even");
        }
     }
}
