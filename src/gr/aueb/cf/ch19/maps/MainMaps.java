package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainMaps {
    public static void main(String[] args) {
        Map<String,String> countries = new HashMap<>();

        // Add
        countries.put("GR", "Greece");
        countries.put("EN", "England");
        countries.put("US", "United States");

        // Update
        countries.put("US", "U. States"); // Because we used the same key, we make update.

        //Get
        String value = countries.get("GR");
        System.out.println(value); // print Greece

        // 3 ways to print or to iterate general
        //With iterator
        Iterator<Map.Entry<String,String>> it = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry =it.next();
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }
        //with for
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }
        //With enhance for
        countries.forEach((k, v) -> System.out.println("Key: " + k + " value: " + v));

        //if we want to remove
        countries.remove("GR");

    }
}
