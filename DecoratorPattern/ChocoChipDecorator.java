public class ChocoChipDecorator extends ICDecorator {
    public ChocoChipDecorator(ICream ic){
        super(ic);
    }
    public double getCost(){
        return super.getCost()+50;
    }
    public String getDescription(){
        return super.getDescription()+"ChocoChips ";
    }
}
