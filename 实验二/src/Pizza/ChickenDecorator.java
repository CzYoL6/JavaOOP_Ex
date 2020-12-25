package Pizza;

public class ChickenDecorator extends SubstanceDecorator{

    public ChickenDecorator(Pizza piz) {
        super(piz, 5, "chicken");
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
