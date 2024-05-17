import java.util.*;
public class profit_loss {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price");
        int cp=sc.nextInt();
        System.out.println("Enter selling price");
        int sp=sc.nextInt();
        if (sp>cp) {
            System.out.print(" you made a profit :");
            System.out.println(sp-cp);
            
        }else     
        // cp>sp 
        {
            System.out.print(" you have loos :");
            System.out.println(cp-sp);
        }
    }
}