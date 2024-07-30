package AdapterPattern;

public class EndUser {
    public static void main(String[] args){
        Sensor s = new Sensor();
        s.setTc();
        Adapter a = new Adapter(s);
        Display d = new Display();
        d.setTf(a.getTCF());
        System.out.println("Temperature in FH : "+d.getTf());
    }
    
}
