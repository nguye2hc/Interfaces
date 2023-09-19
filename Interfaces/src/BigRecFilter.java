import java.awt.*;

public class BigRecFilter implements Filter{
    @Override
    public boolean accept(String word) {
        return false;
    }
    @Override
    public boolean accept(Rectangle x) {
        return (x.getHeight() + x.getWidth()) > 5;
    }
}