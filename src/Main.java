import structural.decorator.coffe.Coffee;
import structural.decorator.coffe.MilkDecorator;
import structural.decorator.coffe.SimpleCoffee;
import structural.decorator.coffe.WhipDecorator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Description: " + simpleCoffee.getDescription());
        System.out.println("Cost: $: " + simpleCoffee.getCost());

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Description: " + milkCoffee.getDescription());
        System.out.println("Cost: $: " + milkCoffee.getCost());

        Coffee milkWhipCoffee = new WhipDecorator(milkCoffee);
        System.out.println("Description: " + milkWhipCoffee.getDescription());
        System.out.println("Cost: $: " + milkWhipCoffee.getCost());

    }
}