package src.lsp.problem;


public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Square();

        rectangle.setHeight(10);
        rectangle.setWidth(5);

        System.out.println("Area: " + rectangle.getArea());
    }

}
