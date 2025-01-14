package gr.aueb.cf.ch15;

public class Point2D extends Point {
    private double y;

    public Point2D() {
        //super(); //As 1st order call the default constructor of Point.java
        //y = 0;
    }

    public Point2D(double x, double y) {
        super(x); // Call the overloaded constructor of the Point
        //setX(x); // we make this or the super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + y +")";
    }


    //    @Override
//    public String pointToString() {
//        return super.pointToString() + "(" + y +")";
//    }

    // Liskov substitution principle. Mean, we can't have bigger restriction than superclass
    @Override
    public void movePlusTen() {
        super.movePlusTen();
        y += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y ++;
    }
}
