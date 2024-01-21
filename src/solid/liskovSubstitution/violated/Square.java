package solid.liskovSubstitution.violated;

public class Square extends Rectangle
{
    public Square(int side)
    {
        super(side, side);
    }
    @Override
    public void setWidth(int width)
    {
        setSide(width);
    }

    @Override
    public void setHeight(int height)
    {
        setSide(height);
    }

    public void setSide (int side)
    {
        super.setHeight(side);
        super.setWidth(side);
    }
}
