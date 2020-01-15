public class Point{
    private double x;
    private double y; 

    public Point(double x, double y){
        this.x = x;
        this.y = y; 
    }

    public double getX(){
        return this.x; 
    }

    public double getY(){
        return this.y; 
    }

    public double calcDistance( Point point2){
        double xDist = point2.getX() - this.getX();
        double yDist = point2.getY() - this.getY();
        double distance = Math.sqrt((xDist * xDist) + (yDist * yDist));
        return distance; 
        

    }

}