package gr.aueb.cf.ch15;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {
       // super(); // constructor chaining
       //z= 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + z + ")";
    }

    //    @Override
//    public String pointToString() {
//        return super.pointToString() + "(" + z + ")";
//        //return "(" + getX() + ", " + getY() + ", " + z + ")"; // If we don't use the inheritance we would have written this.
//    }

    @Override
    public void movePlusTen() {
        super.movePlusTen();
        z += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z++;
    }
}





