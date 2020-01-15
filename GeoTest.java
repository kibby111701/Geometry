public class GeoTest{
    public static void main(String[] args) {
        
        Point p1 = new Point(15, 15);
        Point p2 = new Point(23, 30);
        Point p3 = new Point(50, 25);

        Triangle triangle = new Triangle(p1, p2, p3);

        System.out.println(triangle.area());
    }
}