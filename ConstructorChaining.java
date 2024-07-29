class temp27
{
    temp27()
    {
        this(5);
        System.out.println("Default Constructor");
    }
    temp27(int a)
    {
        this(5,7);
        System.out.println(a);
    }
    temp27(int a,int b)
    {
        System.out.println(a*b);
    }
}

public class ConsttuctorChaining
{
    public static void main(String[] args)
    {
        new temp27();
    }
}
