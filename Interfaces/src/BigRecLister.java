import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class BigRecLister {
    public static void main(String[] args)
    {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        BigRecFilter filter = new BigRecFilter();

        //Add rectangle value
        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(2, 5));
        rectangles.add(new Rectangle(3, 5));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(5, 2));
        rectangles.add(new Rectangle(9, 5));
        rectangles.add(new Rectangle(7, 9));
        rectangles.add(new Rectangle(1, 4));
        rectangles.add(new Rectangle(3, 2));
        rectangles.add(new Rectangle(2, 7));

        //Check if rectangle's perimeter bigger than 10
        for(Rectangle rec : rectangles)
        {
            if(filter.accept(rec))
            {
                System.out.println(rec);
            }
        }
    }
}