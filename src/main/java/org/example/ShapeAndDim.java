package org.example;
import java.util.logging.*;
public class ShapeAndDim {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    private static final String TRIANGLE = "TRIANGLE";
    private static final String RECTANGLE = "RECTANGLE";
    private static final String CIRCLE = "CIRCLE";

    double length;

    double breadth;
    double radius;
    double side1;
    double side2;
    double side3;
    double base;
    double height;
    static final float PI = 3.14f;

    ShapeAndDim(float a, float b) {
        length = a;
        breadth = b;
    }

    ShapeAndDim(float b1, float h1, float s1, float s2, float s3) {
        base = b1;
        height = h1;
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    ShapeAndDim(float r) {
        radius = r;
    }

    public double perimeter(String s) {
        if (((s.toUpperCase()).compareTo(TRIANGLE)) == 0) {
            return (side1 + side2 + side3);
        } else if (((s.toUpperCase()).compareTo(RECTANGLE)) == 0) {
            return (2 * (length + breadth));
        } else if (((s.toUpperCase()).compareTo(CIRCLE)) == 0) {
            return (2 * PI * radius);
        }
        return 0.0;
    }

    public double area(String s) {
        if (((s.toUpperCase()).compareTo(TRIANGLE)) == 0) {
            return (0.5 * base * height);
        } else if (((s.toUpperCase()).compareTo(RECTANGLE)) == 0) {
            return (length * breadth);
        } else if (((s.toUpperCase()).compareTo(CIRCLE)) == 0) {
            return (PI * radius * radius);
        }
        return 0.0;
    }
}
