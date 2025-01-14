package gr.aueb.cf.ch15;

public class PointMain {
    public static void main(String[] args) {

          //We can make this
//        Point point = new Point();
//        Point2D point2D = new Point2D();
//        Point3D point3D = new Point3D();

//        doMovePlus10(point);
//        doMovePlus10(point2D);
//        doMovePlus10(point3D);

        // or we can make like this
        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        doPrint(p1);


        p2.movePlusTen();
        p2.movePlusOne();

        doPrint(p2);

        p3.movePlusTen();

        ((Point2D) p2).setY(15); // We make downcast because this is wrong p2.setY(15) because the p2 is Point and the Point don't have Y, only X.


    }

    //Polymorphic method because the Point may be 2D or and 3D
    public static void doMovePlus10(Point point) {
        point.movePlusTen();
    }

    public static void doPrint(Point point) {
        System.out.println(point.toString());
    }
}
