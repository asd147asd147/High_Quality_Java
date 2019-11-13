package hw3;
/**
Abstract base class for drawing simple shapes on the screen
using characters.
*/
public abstract class ShapeBase implements ShapeInterface
{
    private int offset;
    public abstract void drawHere ();

    /*
    The rest of the class is identical to ShapeBasics in Listing 8.11,
    except for the names of the constructors.Only the method
    drawHere is abstract.  Methods other than drawHere have bodies and do
    not have the keyword abstract in heir headings.
    We repeat one such method here:
    */

    public ShapeBase ()
    {
        offset = 0;
    }

    public ShapeBase (int theOffset)
    {
        offset = theOffset;
    }

    public void setOffset (int newOffset)
    {
        offset = newOffset;
    }

    public int getOffset ()
    {
        return offset;
    }

    public void drawAt (int lineNumber)
    {
        for (int count = 0 ; count < lineNumber ; count++)
            System.out.println ();
        drawHere ();
    }

}