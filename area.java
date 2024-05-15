import java.util.Scanner;
class area {
    public static void main(String[] args) 
    {
    int len,bre,area;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length");
    len=sc.nextInt();
    System.out.println("Enter breadth");
    bre=sc.nextInt();
    area=len*bre; 
    System.out.println("area= "+area);   
    }
}
