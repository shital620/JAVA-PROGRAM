import java.util.*;

public class reverse_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
    
         for(int n=num; n>=1;n--)
         {
            System.out.println(n);
         }
    }
    
}