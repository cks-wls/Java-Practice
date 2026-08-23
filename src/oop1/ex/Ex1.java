package oop1.ex;

public class Ex1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 5;
        int area = rectangle.calculateArea();
        int parameter = rectangle.calculateParameter();
        boolean square = rectangle.isSquare();
        System.out.println("넓이 : " + area);
        System.out.println("둘레 길이 : " + parameter);
        if (square) {
            System.out.println("정사각형입니다.");
        } else {
            System.out.println("정사각형이 아닙니다.");
        }


    }
}

