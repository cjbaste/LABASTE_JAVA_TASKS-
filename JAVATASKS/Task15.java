package JAVATASKS;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
/*---------------------------------------------------------------------------- */
abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width; 
    }
    public double calculatePerimeter() {
        return 2 * (length + width); 
    }
    public String getColor() {
        return color;
    }
}
/*---------------------------------------------------------------------------- */
class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
/*---------------------------------------------------------------------------- */
class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
/*---------------------------------------------------------------------------- */
public class Task15 {

    public static void main(String[] args) {
        Circle circle = new Circle("Red", 9.0); 
        Rectangle rectangle = new Rectangle("Blue", 6.0, 9.0); 

        System.out.println("--- Circle Details ---");
        System.out.println("Color: " + circle.getColor());
        System.out.printf("Radius: %.2f%n", circle.getRadius());
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", circle.calculatePerimeter());
        System.out.println(); 

        System.out.println("--- Rectangle Details ---");
        System.out.println("Color: " + rectangle.getColor());
        System.out.printf("Length: %.2f%n", rectangle.length);
        System.out.printf("Width: %.2f%n", rectangle.width);
        System.out.printf("Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.calculatePerimeter());
    }
    
}
