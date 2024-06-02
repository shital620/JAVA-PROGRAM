import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b values");
        int b=sc.nextInt();
        int ans=1;
        for(int i=1; i<=b; i++)
        {
            ans*=i;
        }
        System.out.println("The power of"+ans);
    }
    
    
}
