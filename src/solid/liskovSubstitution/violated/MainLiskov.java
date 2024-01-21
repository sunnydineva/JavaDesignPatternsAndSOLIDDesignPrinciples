package solid.liskovSubstitution.violated;

public class MainLiskov
{
    public static void main(String[] args)
    {
        //Liskov – we should be able to substitute base class objects with child class object
        // & this should not alter behavior/ chracteristic of the program:

        //VIOLATION EXAMPLE:

        Rectangle rectangle = new Rectangle(10 ,20);
        System.out.println(rectangle.computeArea());

        Square square = new Square(10);
        System.out.println(square.computeArea());

        useRectangleTest(rectangle);
        useRectangleTest(square);

    }

    private static void useRectangleTest(Rectangle rectangle)
    {
        rectangle.setWidth(20);
        rectangle.setWidth(30);

        //IF NOT VM ENABLE ASSERTIONS:
        //        if (rectangle.getHeight() != 20)
        //            throw new AssertionError("Height Not equal to 20");

        assert rectangle.getHeight() == 20 : "Height Not equal to 20";
        assert rectangle.getWidth() == 30 : "Height Not equal to 30";
    }

    //the test is failing - even thought technically we did the right actions, we have modified the behavior that is expected of the base class with Overwrite
}
