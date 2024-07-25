public abstract class ICDecorator implements ICream {
    protected ICream ic;
    protected ICDecorator(ICream ic){
        this.ic=ic;
    }
    public double getCost(){
        return ic.getCost();
    }
    public String getDescription(){
        return ic.getDescription();
    }
}
