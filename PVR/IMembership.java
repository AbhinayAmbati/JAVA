package PVR;

public interface IMembership {
    String ticketPrice(double price);
}

class Platinum implements IMembership{
    public String ticketPrice(double price){
        double finalPrice = price - ((30.0/100)*price);
        return "You got 30% discount"+"\n"+"Final Price : "+finalPrice + "\n"+"Your eligible for to get discount in food and Parking";
    }
}

class Gold implements IMembership{
    public String ticketPrice(double price){
        double finalPrice = price - ((20.0/100)*price);
        return "You got 20% discount"+"\n"+"Final Price : "+finalPrice + "\n"+"Your eligible for to get discount in Parking";
    }
}

class Silver implements IMembership{
    public String ticketPrice(double price){
        double finalPrice = price - ((10.0/100)*price);
        return "You got 10% discount"+"\n"+"Final Price : "+finalPrice + "\n"+"Your not eligible to get discount in any other things";
    }
}


