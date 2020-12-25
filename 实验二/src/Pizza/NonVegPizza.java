package Pizza;

public class NonVegPizza extends Pizza{

    @Override
    public int getCost() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Non-Vegetable Pizza.Pizza";
    }
}
