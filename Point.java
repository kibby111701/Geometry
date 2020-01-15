public class Point{
    private int x;
    private int y; 

    public Point(int x, int y){
        this.x = x;
        this.y = y; 
    }

    public double getX(){
        return this.x; 
    }

    public double getY(){
        return this.y; 
    }

    public static double calcDistance(Point point1, Point point2){
        int xDist = point2.getX() - point1.getX();
        int yDist = point2.getY() - point2.getY();
        double distance = Math.sqrt((xDist * xDist) + (yDist * yDist));
        return distance; 
        

    }

}