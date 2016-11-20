import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Chessboard extends GraphicsProgram {

    public static int chessfieldWidth = 100;
    public static int colNameWidth = 50;
    public static String[] columns = {"A", "B", "C", "D", "E", "F", "G", "H"};
    public static String[] rows = {"8", "7", "6", "5", "4", "3", "2", "1" };

    public void run() {
        setSize(chessfieldWidth * columns.length + colNameWidth * 2, chessfieldWidth * rows.length + colNameWidth * 2);
        printColumnNames(0);
        printColumnNames(colNameWidth + chessfieldWidth * rows.length);
        for (int rowNumber = 0; rowNumber < rows.length; rowNumber++) {
            GLabel preLabel = new GLabel(rows[rowNumber]);
            GLabel postLabel = new GLabel(rows[rowNumber]);
            add(preLabel,
                    elementHorizontalCenter(preLabel, colNameWidth),
                    colNameWidth + chessfieldWidth * rowNumber + elementVerticalCenter(preLabel, chessfieldWidth));
            add(postLabel,
                    elementHorizontalCenter(postLabel, colNameWidth) + colNameWidth + chessfieldWidth * columns.length,
                    colNameWidth + chessfieldWidth * rowNumber + elementVerticalCenter(postLabel, chessfieldWidth));

            for (int columnNumber = 0; columnNumber < columns.length; columnNumber++) {
                GRect field = new GRect(chessfieldWidth, chessfieldWidth);
                /*
                field.setFilled((columnNumber + rowNumber) % 2 == 1);
                field.setColor(Color.LIGHT_GRAY);
                add(field, colNameWidth + chessfieldWidth * columnNumber, colNameWidth + chessfieldWidth * rowNumber);
                */
                if ((columnNumber + rowNumber) % 2 == 1) {
                    field.setFilled(true);
                    field.setColor(Color.LIGHT_GRAY);
                    add(field, colNameWidth + chessfieldWidth * columnNumber, colNameWidth + chessfieldWidth * rowNumber);
                }
            }

        }
    }

    public void printColumnNames(int height) {
        for (int i=0; i < columns.length; i++) {
            GLabel label = new GLabel(columns[i]);
            add(label,
                    colNameWidth + chessfieldWidth * i + elementHorizontalCenter(label, chessfieldWidth),
                    height + elementVerticalCenter(label, colNameWidth));
        }
    }

    public double elementHorizontalCenter(GObject object, int width) {
        return (width - object.getWidth()) / 2;
    }

    public double elementVerticalCenter(GObject object, int height) {
        return (height - object.getHeight()) / 2;
    }


    public static void main(String[] args) {
        new Chessboard().start(args);
    }

}
