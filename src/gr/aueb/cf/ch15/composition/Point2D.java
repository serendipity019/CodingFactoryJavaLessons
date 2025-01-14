package gr.aueb.cf.ch15.composition;

/**
 * Composition and Forwarding
 * Now if something change in Point method where is the parent then our method will not change
 * completely.
 */
public class Point2D {
    private Point point; // This is the difference with the inherit method.
    private double y;

    public Point2D() {

    }

    public Point2D(Point point) {
        this.point = point;
        this.y = y;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "point=" + point +
                ", y=" + y +
                '}';
    }
}
