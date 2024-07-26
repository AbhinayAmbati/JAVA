package PVR;

import java.util.Scanner;

public class EndUsers {
    public static  void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter ticket price : ");
        int tp = read.nextInt();
        System.out.print("Enter type of membership : ");
        String m = read.next();
        MemberFactory mf = MemberFactory.identifyMemberShip(m);
        IMembership v = mf.createTicket();
        System.out.println(v.ticketPrice(tp));
        read.close();
    }
}
