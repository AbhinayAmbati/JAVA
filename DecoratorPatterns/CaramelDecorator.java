public class CaramelDecorator extends ICDecorator {
    public CaramelDecorator(ICream ic){
        super(ic);
    }
    public double getCost(){
        return super.getCost()+60;
    }
    public String getDescription(){
        return super.getDescription()+"Caramel ";
    }
}