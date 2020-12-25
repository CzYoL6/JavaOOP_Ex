package Pizza;

public abstract class SubstanceDecorator extends Pizza{
    protected int price;
    protected String topping;
    protected Pizza pizza;
    public SubstanceDecorator(Pizza piz, int pri, String top){
        pizza = piz;
        price = pri;
        topping = top;
    }

    @Override
    public int getCost() {
        int ret = price;
        if(pizza != null) ret += pizza.getCost();
        return ret;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with " + topping;
    }
}
