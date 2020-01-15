public class Triangle{
    private Point pOne;
    private Point pTwo;
    private Point pThree;


    public Triangle(Point pOne, Point pTwo, Point pThree){
        this.pOne = pOne;
        this.pTwo = pTwo;
        this.pThree = pThree;
    }

    public double area(){
        double sideOne = pOne.calcDistance(pTwo);
        double sideTwo = pTwo.calcDistance(pThree);
        double sideThree = pThree.calcDistance(pOne);

        double perimeter = sideOne + sideTwo + sideThree;
        double semiPerim = perimeter/2;

        double area = Math.sqrt(semiPerim * (semiPerim-sideOne) * 
            (semiPerim - sideTwo) * (semiPerim - sideThree));
        
        return area;
    }


}