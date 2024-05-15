
import java.util.*;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p;
        float t;
        float r;
        float SI;
        System.out.println("enter percentage");
        p=sc.nextFloat();
        System.out.println("enter time");
        t=sc.nextFloat();
        System.out.println("Enter rate");
        r=sc.nextFloat();
        SI=p*t*r/100;
        System.out.println(SI);

    }
    
}
