import java.util.*;
public class areaperimetergreather {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght: ");
        int lenght=sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth=sc.nextInt();
        int area=lenght*breadth;
        int perimeter=2*(lenght*breadth);
        if (area>perimeter) {
            System.out.println("Area is greater then perimeter");
            
        }
        System.out.println("perimeter is greater then area");

    }
}