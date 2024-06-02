import java.util.*;
public class num_rectangular{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    for(int i=1; i<=n; i++)
    {
        for(int j=1;j<=n;j++)  
        { 
            System.out.print(j);
         }
            for(int k=1;k<=i-1;k++)
            {
                System.out.print(k);
            }
        System.out.println();
    }
}
}

/*Enter a number
5
12345
123451
1234512
12345123
123451234 */