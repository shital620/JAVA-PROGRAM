import java.util.*;
public class countDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int numofdigit=0;
        int number=n;
         while (n>0) {
            n=n/10;
            numofdigit++;
         }
         System.out.println("Number of digit "+number+"="+numofdigit);
        
    }
}
