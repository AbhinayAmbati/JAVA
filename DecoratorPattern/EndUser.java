import java.util.Scanner;

public class EndUser {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ICream ic=null;
        System.out.println("Choose a flavor:");
        System.out.println("1. Vanilla");
        System.out.println("2. StrawBerry");
        int flavorChoice = read.nextInt();
        
        switch (flavorChoice) {
            case 1:
                ic = new Vanilla();
                break;
            case 2:
                ic = new StrawBerry();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Vanilla.");
                ic = new Vanilla();
                break;
        }
        boolean repeat=true;
        int choice;
        while (repeat) {
            System.out.println("Enter topinns\n1.Chocolate");
            System.out.println("2.Caramel");
            System.out.println("3.Exit");
            choice=read.nextInt();
            switch (choice) {
                case 1:
                    ic=new ChocoChipDecorator(ic);
                    break;
                    case 2:
                    ic=new CaramelDecorator(ic);
                    break;
                default:
                System.out.println("Cost : "+ic.getCost());
                System.out.println("Description : "+ic.getDescription());
                repeat=false;
                    break;
            }
        }
        read.close();
    } 
}
