package PVR;

public class GoldFactory extends MemberFactory {
    public  IMembership createTicket(){
        return new Gold();
    }
}
