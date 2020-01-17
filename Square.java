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

        public static boolean overLap(Square square1, Square square2){
            if(square1.topLeft().getX() < square2.bottomRight().getX() && square1.topLeft().getY() > square2.bottomLeft().getY() &&
             square1.bottomRight().getX() > square2.bottomRight().getX() && square1.bottomRight().getY() <  square2.bottomRight().getY()){
            return true;
            } else if(square1.topRight() < square2.bottomLeft().getx()
        }
    }



}