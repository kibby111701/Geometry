public class Square{
    private double x;
    private double y;

    public Square(Point p1, Point p2, Point p3, Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;

    }

    public calcDistance(Point p2){
        return calcDistance(p1,p2);

    }

    public calcArea(Point p1, Point p2){
        
    }

    public double getP1(){
        return p1;
    }

    public double getP2(){
        return p2;
    }

    public double getP3(){
        return p3;
    }

    public double getP4(){
        return p4;
    }
}