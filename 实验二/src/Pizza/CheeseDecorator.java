package Pizza;

public class CheeseDecorator extends SubstanceDecorator{

    public CheeseDecorator(Pizza piz) {
        super(piz, 10, "cheese");
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
