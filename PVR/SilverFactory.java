package PVR;

public class SilverFactory extends MemberFactory {
    public  IMembership createTicket(){
        return new Silver();
    }
}
