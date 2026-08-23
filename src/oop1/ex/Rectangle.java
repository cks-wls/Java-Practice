package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    int calculateParameter() {
        return (width + height) * 2;
    }

    boolean isSquare() {
        if (width == height) {
            return true;
        }
        return false;
    }
}
