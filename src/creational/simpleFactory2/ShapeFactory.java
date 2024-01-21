package creational.simpleFactory2;

public class ShapeFactory
{
    public static Shape getShape(String shapeName)
    {
        if(shapeName.equalsIgnoreCase("Circle"))
        {
            return new Circle();
        } else if(shapeName.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        return null;
    }
}
