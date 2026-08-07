package _000_TutorialQuestions.Tutorial3;

public class Geometry{

    public void calculateArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    public void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    public void calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle: " + area);
        }
    }

    public static void main(String[] args) {
        Geometry geo = new Geometry();
        geo.calculateArea(5.0);
        geo.calculateArea(4.0, 6.0);
        geo.calculateArea(3.0, true);
    }
}
