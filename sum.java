import java.io.*;
 class sum
  {
    public static void main(String[] args)throws IOException /*IOException->input
     lete time karte hai means that erorr throws ke liy use karte hai */
    {
        int a,b,sum;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        /*
        (BufferedReader me object bana rahe hai jisaka name br hai,
         br new inputstream ko reader kar ke system me in karta hai ) */
        System.out.println("enter first Number");
        a=Integer.parseInt(br.readLine());/*Integer.parseInt ak method hai jo ki 
        string value ko int mr change karata hai */
        System.out.println("second first Number");
        b=Integer.parseInt(br.readLine());
        sum=a+b;
        System.out.println("sum= "+sum);
        /* system.out.println-> capital S hoga
         * BuffueredReader->B and R capital hoga
         * InputStream(system.in)->I,S ans S capital hoga
         * Integer.parseInt->I and Int capital hoga
         * readLine->L capital hoga 
         */

    }
}
