public class Square{
    private Point bottomLeft;
    private double sideLength;

    public Square(Point bottomLeft, double sideLength){
        this.bottomLeft = bottomLeft;
        this.sideLength = sideLength;
    }

    public Point getBottomLeft(){
        return this.bottomLeft;
    }

    public double getSideLength(){
        return this.sideLength;
    }

    public double area(){
        return sideLength * sideLength;
    }

    public double perimeter(){
        return sideLength * 4;
    }

    public Point topRight(){
        Point topRight = new Point(bottomLeft.getX() + sideLength, bottomLeft.getY() + sideLength);
        return topRight;
    }

    public Point topLeft(){
        Point topLeft = new Point(bottomLeft.getX(), bottomLeft.getY() + sideLength);
        return topLeft;
    }

    public Point bottomRight(){
        Point bottomRight = new Point(bottomLeft.getX()+sideLength, bottomLeft.getY());
        return bottomRight;
    }

    public boolean differentSigns(Point point1, Point point2){
        return point1.getX() < point2.getX() && point1.getY() > point2.getY();
    }

    public boolean sameSign(Point point1, Point point2){
        return point1.getX() > point2.getX() && point1.getY() > point2.getY();
    }

    public static boolean overLap(Square square1, Square square2){
        if(differentSigns(square1.topLeft(), square2.bottomRight()) && differentSigns(square2.bottomRight(), square1.bottomRight()){
            return true;
        }else if(square1.topLeft().getX() > square2.topLeft().getX() && square1.topLeft().getY() < square2.topLeft().getY() && 
        square1.bottomRight().getX() < square2.bottomRight().getX() && square1.bottomRight().getY() > square2.bottomRight().getY()){
            return true;
        }else { 
            return false;
        }
    }
}