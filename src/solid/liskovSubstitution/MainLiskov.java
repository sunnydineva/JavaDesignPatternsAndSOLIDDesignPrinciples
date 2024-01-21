package solid.liskovSubstitution;

public class MainLiskov
{
    public static void main(String[] args)
    {

        //Liskov – we should be able to substitute base class objects with child class object
        // & this should not alter behavior/ chracteristic of the program:

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.computeArea());

        Square square = new Square(10);
        System.out.println(square.computeArea());

        useRectangleTest(rectangle);

        useSquareTest(square);
        // useRectangle(square); not makes any promises for connection between rectangle and square

    }

    private static void useRectangleTest(Rectangle rectangle)
    {
        rectangle.setHeight(20);
        rectangle.setWidth(30);

        //        if (rectangle.getHeight() != 20)
        //            throw new AssertionError("Height Not equal to 20");

        assert rectangle.getHeight() == 20 : "Height Not equal to 20";
        assert rectangle.getWidth() == 30 : "Height Not equal to 30";
    }

    private static void useSquareTest(Square square)
    {
        square.setSide(20);
        //        if (rectangle.getHeight() != 20)
        //            throw new AssertionError("Height Not equal to 20");

        assert square.getSide() == 20 : "Side Not equal to 20";
    }

}
