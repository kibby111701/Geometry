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




}