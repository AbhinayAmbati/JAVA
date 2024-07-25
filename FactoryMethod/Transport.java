import java.util.Scanner;

public class Transport {
    private static IVehicle identifyIVehicle(String mode) {
        if (mode.equals("truck")) {
            return new Truck();
        } 
        if (mode.equals("ship")) {
            return new Ship();
        }
        return null;
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter distance: ");
        double d = read.nextDouble();
        System.out.print("Enter mode of transport : ");
        String mode = read.next();
        
        IVehicle v = identifyIVehicle(mode);
        
        System.out.println("Cost: " + v.calcCost(d));
        System.out.println("Time: " + v.calcTime(d));
        read.close();
    }
}
