import java.util.Scanner;

public class EndUsers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the transport mode: ");
        String m = s.next();
        System.out.print("Enter distance : ");
        int d = s.nextInt();
        TransportFactory tf = TransportFactory.IdentifyVehicleFactory(m);
        assert tf != null;
        IVehicle v = tf.createVehicle();
        System.out.println(v.calcCost(d));
        System.out.println(v.calcTime(d));
        s.close();
    }
}
