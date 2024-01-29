package structural.decorator.coffe;

public class WhipDecorator extends CoffeeDecorator{
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }
}
