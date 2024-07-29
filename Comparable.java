import java.util.ArrayList;
import java.util.Collections;

class CollectionsC implements Comparable<CollectionsC>
{
    public int compareTo(CollectionsC str)
    {
        return this.id-str.id;
    }

    private int id;
    private String name;
    private int age;
    private int fee;

    public CollectionsC(int id,String name,int age,int fee)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.fee=fee;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getFee()
    {
        return fee;
    }

    public String toString()
    {
        return "[id = "+id+" name = "+name+" age = "+age+" fee = "+fee+"]";
    }
    
}
public class CollectionsCs
{
    public static void main(String[] args) 
    {
        ArrayList<CollectionsC> str = new ArrayList<>();
        str.add(new CollectionsC(1,"abhi",19,1400));
        str.add(new CollectionsC(8, "pawan", 41, 45555));
        str.add(new CollectionsC(7, "Ram", 40, 10000));
        for(CollectionsC i:str)
        {
            System.out.println(i);
        }
        Collections.sort(str);
            System.out.println("\n");
            for(CollectionsC i:str)
            {
                System.out.println(i);
            }
    }
}
