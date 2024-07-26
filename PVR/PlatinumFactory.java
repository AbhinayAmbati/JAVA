package PVR;

public class PlatinumFactory extends MemberFactory {
    public IMembership createTicket(){
        return new Platinum();
    }
}
