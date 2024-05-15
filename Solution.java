
/*Input 
java 100
cpp 65
python 50
Your Output 
================================
java           100
cpp            065
python         050
================================ 
hackerank */


import java.util.Scanner;

public class Solution {

    public static void main(String[] args)
     {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String sl=sc.next();
                int xl=sc.nextInt();
                //Complete this line
            
            System.out.printf("%-15s%03d\n",sl,xl);
            }
            System.out.println("================================");

    }
}

    
