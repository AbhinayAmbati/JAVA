public abstract class TransportFactory {
    public abstract IVehicle createVehicle();
    public static TransportFactory IdentifyVehicleFactory(String m){
        switch (m){
            case "truck" : return new RoadTransportFactory();
            case "ship" : return new WaterTransportFactory();
            default: return null;
        }
    }
}
