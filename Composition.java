import java.util.Scanner;
class Address1
{
    private String city,state,zipcode;
    public Address1(String city,String state,String zipcode)
    {
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
    }
    void setcity(String city)
    {
        this.city=city;
    }
    String getcity()
    {
        return this.city;
    }
    void setstate(String state)
    {
        this.state=state;
    }
    String getstate()
    {
        return this.state;
    }
    void setzipcode(String zipcode)
    {
        this.zipcode=zipcode;;
    }
    String getzipcode()
    {
        return this.zipcode;
    }
    public String toString()
    {
        return city+" "+state+" "+zipcode;
    }
}
class Person
{
    private String sname;
    private Address1 address1;
    public Person(String sname,Address1 address1)
    {
        this.sname=sname;
        this.address1=address1;
    }
    void setname(String sname)
    {
        this.sname=sname;
    }
    String getsname()
    {
        return this.sname;
    }
    void setaddress1(Address1 address1)
    {
        this.address1=address1;
    }
    Address1 getaddress1()
    {
        return this.address1;
    }
    public String toString()
    {
        return "Name "+sname+" Address "+address1.toString();
    }
}
public class Composition 
{
    public static void main(String[] args)
    {
        Scanner read  = new Scanner(System.in);
        Address1 address1 = new Address1(read.next(), read.next(), read.next());
        Person person = new Person(read.next(), address1);
        System.out.println(person);
        read.close();
    }
    
}
