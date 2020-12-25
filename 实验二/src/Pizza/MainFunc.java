package Pizza;

public class MainFunc {
    public static void main(String[] args) {
        Pizza VegPizzaWithChicken = new ChickenDecorator(new VegPizza());
        System.out.println(VegPizzaWithChicken.getDescription());
    }
}
