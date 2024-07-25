public class RoadTransportFactory extends TransportFactory {
    public IVehicle createVehicle() {
        return new Truck();
    }
}
