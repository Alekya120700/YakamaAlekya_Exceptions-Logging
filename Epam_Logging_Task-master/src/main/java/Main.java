import house_cost_calculator.HouseCost;

public class Main {
    public static void main(String[] args) {

        HouseCost houseCost = new HouseCost(1,25,false);
        houseCost.calculateConstructionCost();
    }
}
