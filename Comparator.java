import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CollectionsS {

    private int id;
    private String name;
    private int age;
    private int fee;

    public CollectionsS(int id,String name,int age,int fee) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.fee=fee;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getFee() {
        return fee;
    }

    public String toString() {
        return "[id = "+id+" name = "+name+" age = "+age+" fee = "+fee+"]";
    }
    
}
class IdComparator implements Comparator<CollectionsS> {
    public int compare(CollectionsS s1,CollectionsS s2) {
        return s1.getId()-s2.getId();
    }
}

public class CollectionsSc {
    public static void main(String[] args) {
        ArrayList<CollectionsS> str = new ArrayList<>();
        str.add(new CollectionsS(1, "a", 44, 4000));
        str.add(new CollectionsS(5, "b", 55, 5000));
        str.add(new CollectionsS(10, "ab", 66, 6000));

        for(CollectionsS i:str) {
            System.out.println(i);
        }
        Collections.sort(str, new IdComparator()); 
        
        System.out.println("\nAfter sorting by ID:");
        for(CollectionsS i:str) {
            System.out.println(i);
        }
    }
}
