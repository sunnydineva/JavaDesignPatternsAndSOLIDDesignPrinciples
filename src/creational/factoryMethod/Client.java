package creational.factoryMethod;

public class Client
{
    public static void main(String[] args)
    {
        //Using creator to create a product, choice of creator determines type of product created
        printMessage(new JSONMessageCreator());
        //using another creator to create another product
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator){
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}
