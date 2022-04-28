package be.intecbrussel;

public class CircleApp {
    public static void main(String[] args) {

        Circle c = new Circle();
        System.out.println(c.getRadius());
        System.out.println("Area" + c.getArea());
        System.out.println("Perimeter" + c.getPerimeter());
        System.out.println("-".repeat(30));
        c.grow(5);
        System.out.println(c.getRadius());
        System.out.println("-".repeat(30));
        Circle c2 = new Circle(10);
        System.out.println(Circle.getCount());
        System.out.println(c2.getArea());


    }
}
