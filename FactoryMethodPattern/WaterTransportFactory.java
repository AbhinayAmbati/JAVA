public class WaterTransportFactory extends TransportFactory {
    public IVehicle createVehicle() {
        return new Ship();
    }
}
