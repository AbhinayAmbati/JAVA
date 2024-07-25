
public interface IVehicle {
    double calcCost(double d);
    double calcTime(double d);
}

class Truck implements IVehicle {

    public double calcCost(double d) {
        return d * 2; 
    }

    public double calcTime(double d) {
        return d / 50;
    }
}

class Ship implements IVehicle {
    
    public double calcCost(double d) {
        return d * 5;
    }

    public double calcTime(double d) {
        return d / 30;
    }
}