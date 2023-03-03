package org.example;
import java.util.logging.Logger;
public class BasicPoint implements Cloneable {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    double x;
    double y;

    BasicPoint(double xcord, double ycord) {
        x = xcord;
        y = ycord;
    }


    public boolean eql(double x2, double y2) {
        boolean check = false;
        if (x == x2 && y == y2) {
            check = true;
        }
        return check;
    }

    public BasicPoint copy() throws CloneNotSupportedException {
        return (BasicPoint) this.clone();
    }

}