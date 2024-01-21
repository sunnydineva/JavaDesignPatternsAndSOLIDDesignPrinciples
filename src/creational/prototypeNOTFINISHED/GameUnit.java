package creational.prototypeNOTFINISHED;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable
{
    private Point3D position;

    public GameUnit()
    {
        this.position = Point3D.ZERO;
    }

    @Override
    protected GameUnit clone() throws CloneNotSupportedException
    {
        GameUnit unit = (GameUnit) super.clone();
        unit.initializa();
        return unit;
    }

    protected void initializa()
    {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset(); //implement in children classes
    public GameUnit(float x, float y, float z)
    {
        this.position = new Point3D(x, y, z);
    }

    public  void move (Point3D direction, float distance)
    {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        this.position = position.add(finalMove);
    }

    public Point3D getPosition()
    {
        return position;
    }
}
