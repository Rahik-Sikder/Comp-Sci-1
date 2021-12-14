public class PremiumPackage extends StandardPackage {
    
    public PremiumPackage(int nights) {
        super(nights);    
    }
    
    @Override
    public String getResort() {
        return "Carribeam Resort";
    }
    
    @Override
    public double getCostPerNight() {
        return 150.00;
    }
    
    
    public String getMealPlan() {
        return "Breakfast";
    }
    public String toString() {
        return super.toString() +
                "\nMeal Plan = " + getMealPlan();
    }
}