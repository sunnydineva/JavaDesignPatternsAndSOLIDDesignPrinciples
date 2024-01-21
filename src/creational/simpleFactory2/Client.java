package creational.simpleFactory2;

import static creational.simpleFactory2.ShapeFactory.getShape;

public class Client
{
    public static void main(String[] args)
    {
        Shape circle = getShape("Circle");
        circle.draw();

        Shape square = getShape("Square");
        square.draw();
    }
}
