package Pizza;

public class VegPizza extends Pizza{

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Vegetable Pizza.Pizza";
    }
}
