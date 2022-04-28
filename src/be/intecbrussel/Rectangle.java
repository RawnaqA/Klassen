package be.intecbrussel;

public class Rectangle {
    public static final int ANGLES = 4;
    private static int count ;
    private int height;
    private int width;
    private int x;
    private int y;

   public Rectangle(){
//  نكدر نخليه او نمسحنه بس اذا مسحناه يصير صفر الديفلت اعتقد مو احسن طريقه الجواه احسن وحتى منعيد كل شي شينكتب بذيج يجي هنا
//       setHeight(1);
//       setWidth(1);

       this(1, 1);
   }
// نسويه حتى مندخل المعلومات بالكلاس الرئيسي ونظل نكول الطول علكد والعرض هلكد
   public Rectangle(int height, int width){
       setHeight(height);
       setWidth(width);
//       نكتب هذا الجاي اذا نريد تبدي من مكان محدد مثل ب 50
       setX(50);
       setY(50);
   }
   public Rectangle(int height, int width, int x,int y){
       setHeight(height);
       setWidth(width);
       this.x = x;
       this.y = y;
   }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {

            this.width =Math.abs(width);
    }
    public void setHeight(int height) {
        if (height < 0) {
            this.height = -height;
        } else {
            this.height = height;
        }



    }
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return(height + width) * 2;
    }

    public void grow(int d) {
        if(d>0){
            this.height += d;
            this.width += d;
        }
    }


}

