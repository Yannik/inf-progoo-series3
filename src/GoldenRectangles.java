import acm.graphics.*;
import acm.program.*;

public class GoldenRectangles extends GraphicsProgram {
    public void run() {
        int totalWidth = readInt("width: ");
        int rectangles = readInt("rectangles: ");
        int previousRectX = 50;
        int previousRectY = 50;
        setSize(previousRectX*2 + totalWidth, previousRectY * 2 + (int) Math.round(totalWidth / 1.618d));
        double previousRectWidth = totalWidth;
        double previousRectHeight = totalWidth / 1.618;
        while (rectangles > 0) {
            GRect rectangle = new GRect(previousRectWidth, previousRectHeight);
            add(rectangle, previousRectX, previousRectY);
           // previousRectHeight;
            rectangles--;
        }
    }
}
