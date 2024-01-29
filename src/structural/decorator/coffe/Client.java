package structural.decorator.coffe;

public class Client
{
    public static void main(String[] args)
    {
        Coffee coffee = new SimpleCoffee();
        CoffeeDecorator milkDecorated = new MilkDecorator(coffee);

        System.out.println(milkDecorated.getDescription());
        System.out.println(milkDecorated.getCost());
        System.out.println("=========================================");

        Coffee coffeeWhipAndMilk = new SimpleCoffee();
        CoffeeDecorator coffeeMilk = new MilkDecorator(coffeeWhipAndMilk);
        CoffeeDecorator coffeeMilkAndWhip = new MilkDecorator(coffeeMilk);

        System.out.println("SUBTOTAL: " + coffeeMilk.getDescription() +", "+ coffeeMilk.getCost());

        System.out.println("TOTAL: " + coffeeMilkAndWhip.getDescription() +", "+ coffeeMilkAndWhip.getCost());

    }
}
