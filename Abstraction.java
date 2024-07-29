import java.util.Scanner;

abstract class Shape {
    abstract double area();
    abstract void draw();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    void draw() {
        System.out.println("Circle");
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    void draw() {
        System.out.println("Rectangle");
    }
}

public class Abstraction01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double r = read.nextDouble();
        int l = read.nextInt();
        int b = read.nextInt();

        Circle c = new Circle(r);
        System.out.println("Area of circle: " + c.area());
        c.draw();

        Rectangle rc = new Rectangle(l, b);
        System.out.println("Area of rectangle: " + rc.area());
        rc.draw();
        read.close();
    }
}
