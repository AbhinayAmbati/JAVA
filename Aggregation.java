import java.util.Scanner;
class Add
{
    String city,state,country;
    public Add(String city,String state,String country)
    {
        this.city=city;
        this.state=state;
        this.country=country;
    }
}

public class Aggre_gation 
{
    int id;
    String name;
    Add add;   
    public Aggre_gation(int id,String name,Add add)
    {
        this.id=id;
        this.name=name;
        this.add=add;
    }
    public void display()
    {
        System.out.println("Id : "+id+" "+"Name : "+name);
        System.out.println("City : "+add.city+" "+"State : "+add.state+" "+"Country : "+add.country);
    }
    public static void main(String[] main)
    {
        Scanner read = new Scanner(System.in);
        Add a = new Add(read.next(), read.next(), read.next());
        Aggre_gation ag = new Aggre_gation(read.nextInt(), read.next(), a);
        ag.display();
        read.close();
    }
}
