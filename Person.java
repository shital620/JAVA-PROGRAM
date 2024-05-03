/*Write a java program to create a class called person withprivate instance 
variables name,age,country.provide public getter and setter methods to access and 
modify these variables. */

public class Person {
    public static void main(String[] args) {
        Person1 p=new Person1();
        p.getPerson1("Ankit", 20, "Bihar");
        p.setPerson1();
    }
    
}

 class Person1 {
    private String name;
    private int age;
    private String country;

    public void getPerson1(String N,int A,String c)
    {
        name=N;
        age=A;
        country=c;

    }

    public void setPerson1()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Country: "+country);
    }
    
}