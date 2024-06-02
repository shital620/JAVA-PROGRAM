import java.util.*;
public class numpyramid {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    for(int i=1; i<=n; i++)
    {
        // n-1....speace
        for(int j=1;j<=n-i;j++)  
        { 
            System.out.print(" ");
         }
        //  n to i 
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            // i-1 to 1
            for(int l=i-1;l>=1;l--)
            {
                System.out.print(l);
            }
        System.out.println();
    }

}    

}

/*Enter a number
6
     1
    121
   12321
  1234321
 123454321
12345654321 */