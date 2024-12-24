package gr.aueb.cf.ch13.model;

/**
 * Defines 2 dimension point.
 */
public class Point {
    private static int nomOfPoints = 0;
    private int x;
    private int y;


    public Point(){
        nomOfPoints++;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        nomOfPoints++; //this need and getter
    }
    public int getNomOfPoints(){
        return nomOfPoints;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
