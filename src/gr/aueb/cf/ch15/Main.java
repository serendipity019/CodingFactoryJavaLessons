package gr.aueb.cf.ch15;

import gr.aueb.cf.ch15.model.Point;
import gr.aueb.cf.ch15.model.Teacher;
import gr.aueb.cf.ch15.services.CodingFactorySingleton;
import gr.aueb.cf.ch15.services.HelloUtil;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Ath.", "Androutsos");
        Teacher teacher2 = new Teacher(2, "K.", "Giannoutsou");
        Teacher teacher3 = new Teacher(3, "L.", "Papadopoulos");

        HelloUtil.sayHello();

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomPoint();

        CodingFactorySingleton cf1 =CodingFactorySingleton.getINSTANCE();
        CodingFactorySingleton cf2 =CodingFactorySingleton.getINSTANCE();

        System.out.println(cf1);
        System.out.println(cf2);
    }
}
