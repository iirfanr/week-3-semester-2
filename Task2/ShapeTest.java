package Task2;

public class ShapeTest {

    public static void main(String[] args) {
        // test shape
        Shape shape1 = new Shape();
        System.out.println(shape1);
        shape1.setColor("blue");
        shape1.setFilled(false);
        System.out.println(shape1);
        // test shape (constructor with parameters)
        Shape shape2 = new Shape("yellow", true);
        System.out.println(shape2);

        // test circle
        Circle circle1 = new Circle();
        System.out.println(circle1);
        circle1.setColor("blue");
        circle1.setFilled(false);
        circle1.setRadius(2.5);
        System.out.println(circle1 + ", Area: " + circle1.getArea() + ", Perimeter: " + circle1.getPerimeter());
        // test circle (constructor with parameters)
        Circle circle2 = new Circle(3.0, "yellow", true);
        System.out.println(circle2 + ", Area: " + circle2.getArea() + ", Perimeter: " + circle2.getPerimeter());

        // test square
        Square square1 = new Square();
        System.out.println(square1);
        square1.setColor("red");
        square1.setFilled(true);
        square1.setSide(4.0);
        square1.setWidth(6.0);
        System.out.println(square1 + ", Area: " + square1.getArea() + ", Perimeter: " + square1.getPerimeter());
        // test square (constructor with parameters)
        Square square2 = new Square(5.0, "green", false);
        System.out.println(square2 + ", Area: " + square2.getArea() + ", Perimeter: " + square2.getPerimeter());

    }
    
}
