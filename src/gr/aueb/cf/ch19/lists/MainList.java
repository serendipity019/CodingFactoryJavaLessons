package gr.aueb.cf.ch19.lists;

import java.util.ArrayList;
import java.util.Iterator;

public class MainList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Athens");
        cities.add("NY");
        cities.add("London");

        String a = cities.get(0);

        int nyPosition = cities.indexOf("NY");
        if (nyPosition != -1) {
            cities.set(nyPosition, "New York"); // set in position nyPosition the string New York
        } else {
            System.out.println("NY not exists");
        }

        if (cities.contains("Athens")) {
            cities.remove("Athens");
        } else {
            System.out.println("Athens not exists");
        }

        cities.removeIf(c -> c.startsWith("A")); // remove all items that begins with "A"

        //Iterate or traverse. 4 ways
        //first way
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }
        //second way
        for(String city : cities) {
            System.out.println(city);
        }
        //third way with iterator
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //fourth way
        cities.forEach(System.out::println); // cities.forEach(city -> System.out.println(city));
    }
}
