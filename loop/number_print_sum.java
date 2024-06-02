import java.util.*;

public class number_print_sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
         int number=1;int sum =0;
        while( number<=num)
        {
           System.out.println(number);
            
            sum= sum + number;
         number++;   // number+1; 
        }
        System.out.println("-------------------------------------");
        System.out.println("the sum of all number"+sum);
    }
    
}