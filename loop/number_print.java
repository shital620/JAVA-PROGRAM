import java.util.*;

public class number_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
         int number=1;
        while( number<=num)
        {
            System.out.println(number);
            number++;     // number+1; 
        }
    }
    
}
