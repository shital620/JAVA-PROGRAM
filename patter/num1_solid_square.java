import java.util.Scanner;
public class  num1_solid_square {
    public static void main (String[] args)
    { int n;
        int m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        System.out.println("Enter number");
        m=sc.nextInt();
        for(int i=0; i<=n; i++)
        {
              for(int j=0;j<= m;j++)
            {
                if ((i+j)%2==0) {
                    System.out.print(1);
                    
                }else{
                    System.out.print(2);
                }
            }
            System.out.print("\n");
        }

    }

    
}

/*Enter number
5
121212
212121
121212
212121
121212 */