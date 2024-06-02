import java.util.*;

public class num_triangular {

    public static void main (String[] args)
    { int n;
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
              for(int j=1;j<=i;j++)
            {
                
                System.out.print(j);
                
            }
            System.out.print("\n");
        }
    }
    
}
/*Enter number
6
1
12
123
1234
12345
123456 */