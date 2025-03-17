abstract class Shape {
    abstract void calculateArea();
}

class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle (int width , int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth () {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void calculateArea() {
        int rectangleArea = getWidth() * getHeight();
        System.out.println("Rectangle : " + rectangleArea);
    }
}


class Circle extends Shape {
    private double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }

    @Override
    public void calculateArea() {
        double circleArea = Math.PI * (getRadius() * getRadius());
        System.out.printf("Circle : %.2f\n" , circleArea);
    }
}


public class Calculate_the_Area_of_Geometric_Shapes_Using_Inheritance {
    public static void main (String [] args) {

        Rectangle rec = new Rectangle(12, 12);
        rec.calculateArea();

        Circle circle = new Circle(12);
        circle.calculateArea();
    }
}
