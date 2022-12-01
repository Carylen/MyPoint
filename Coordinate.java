class MyPoint {
    private double x, y;

    /* constructor yang bertipe no-arg constructor yang akan membuat sebuah titik (0,0) */
    public MyPoint() {
        x = y = 0;
    }

    /* constructor yang membuat sebuah titik dengan koordinat tertentu */ //constructor that constructs a point with specified coordinates.
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /* Method getter untuk mereturn titik koordinat x */
    public double getX() {
        return x;
    }

    /* Method getter untuk mereturn titik koordinat y */
    public double getY() {
        return y;
    }

    /* Method yang bernama ' distance ' untuk memberikan jarak antara sebuah titik ke titik lainnya */
    public double distance(MyPoint aPoint) {
        return Math.sqrt((x - aPoint.getX()) * (x - aPoint.getX()) + (y - aPoint.getY()) * (y - aPoint.getY()));
    }

    /* method static yang bernama distance yang akan memberikan jarak antara dua buah objek MyPoint */
    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) +(p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
    }
    
}
public class Coordinate{

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10,30.5);

        System.out.println("MyPoint.distance(p1,p2) = " + MyPoint.distance(p1, p2));
    }
}