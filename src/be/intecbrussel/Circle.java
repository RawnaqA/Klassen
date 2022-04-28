package be.intecbrussel;

public class Circle {

    public static final int ANGLES = 0;
    private static int count =0;
    private int x;
    private int y;
    private int radius;


    public Circle(int radius){
        this.radius = radius;
    }

    public Circle(int radius, int x, int y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    public Circle(){
        this(3,10,10);
        count++;
    }


    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    public void grow(int d){
        if (d>0){
            this.radius +=d;
        }
    }
    public static int getCount(){
        return count;
    }
}
