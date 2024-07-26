package PVR;

public abstract class MemberFactory{
    public abstract IMembership createTicket();
    public static MemberFactory identifyMemberShip(String m){
        switch(m){
            case "platinum" : return new PlatinumFactory();
            case "gold" : return new GoldFactory();
            case "silver" : return new SilverFactory();
            default : return null;
        }
    }
}