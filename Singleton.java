package Codes;

class SingleTon {
    private static SingleTon s = new SingleTon();
    private SingleTon()
    {

    }
    public static SingleTon getInstance()
    {
        return s;
    }
    public void display()
    {
        System.out.println("Hello, World!");
    }
}
public class Student{
    public static void main(String[] args)
    {
        SingleTon s1 = SingleTon.getInstance();
        s1.display();
    }
}
