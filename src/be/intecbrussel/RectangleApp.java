package be.intecbrussel;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle(20,25);
        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle(50, 55,70,80);

        System.out.println("Height:" + rect.getHeight());
        System.out.println("Width:" + rect.getWidth());
        System.out.printf("positions: %d, %d%n", rect.getX(), rect.getY());
        System.out.println("This is area: " + " " +rect.getArea());
        System.out.println("This is Perimeter:" + " " + rect.getPerimeter());

        System.out.println("-".repeat(30));

        System.out.println("Width:" + rect2.getWidth());
        System.out.println("Height:" + rect2.getHeight());
        System.out.printf("positions: %d, %d%n", rect2.getX(), rect2.getY());
        System.out.println("This is area2: " +rect2.getArea());
        System.out.println("This is Perimeter2:" + rect2.getPerimeter());

        System.out.println("-".repeat(30));

        rect.setWidth(-25);
        rect.setHeight(-20);
        rect.setX(100);
        rect.setY(200);

        rect2.setWidth(30);
        rect2.setHeight(22);
        rect2.setX(3);
        rect2.setY(2);


        System.out.println("Height:" + rect.getHeight());
        System.out.println("Width:" + rect.getWidth());
        System.out.printf("positions: %d, %d%n", rect.getX(), rect.getY());
        System.out.println("This is area: " +rect.getArea());
        System.out.println("This is Perimeter:" + rect.getPerimeter());

        System.out.println("-".repeat(30));

//   اذا ردت اكبر اخلي ال grow
        rect2.grow(10);
        System.out.println("Width:" + rect2.getWidth());
        System.out.println("Height:" + rect2.getHeight());
        System.out.printf("positions: %d, %d%n", rect2.getX(), rect2.getY());
        System.out.println("This is area2: " +rect2.getArea());
        System.out.println("This is Perimeter2:" + rect2.getPerimeter());
//      System.out.println("positions:"+ rect2.getX()+ "," +rect2.getY());
//       هذا السطر اذا مردت اسوي بطريقه %


        System.out.println("Height:" + rect3.getHeight());
        System.out.println("Width:" + rect3.getWidth());
        System.out.printf("positions: %d, %d%n", rect3.getX(), rect3.getY());

        System.out.println( "ANGLES :" + " " + Rectangle.ANGLES);

    }

}
