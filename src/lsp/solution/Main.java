package src.lsp.solution;

public class Main {

    public static void main(String[] args) {

        // Derived Classes must be substitutable for their base classes;;;;

        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        rectangle.setHeight(20);
        rectangle.setWidth(10);

        square.setHeight(10);
        square.setWidth(5);

        System.out.println("Area of rectangle::  " + rectangle.valueArea() + "  ///   " + "Area of square::  " + square.valueArea());
    }
}
