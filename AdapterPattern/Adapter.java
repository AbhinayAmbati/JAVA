package AdapterPattern;

public class Adapter {
    private Sensor s;
    public Adapter(Sensor s)
    {
        this.s=s;
    }
    public double getTCF(){
        return (s.getTc()*9/5);
    }
    
}
