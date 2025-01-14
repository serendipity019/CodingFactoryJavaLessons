package gr.aueb.cf.ch15.model;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    private Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point getInstance() {
        return new Point();
    }

    public static Point getRandomPoint() {
        Random random = new Random(System.nanoTime());
        return new Point(random.nextInt(10) + 1, random.nextInt(10) +1 ); // random.nextInt(max -min + 1) + min
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
