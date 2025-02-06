package gr.aueb.cf.ch19.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMain {
    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "London", "Toronto", "Tunis", "Athens");

        var tCities = cities.stream().filter(city -> city.startsWith("T"))
                .collect(Collectors.toList()); // Java8+, mutable List

        var tCities2 = cities.stream().filter(city -> city.length() > 6)
                .toList(); // Java16+, immutable List

        tCities2.forEach(System.out::println);

        //Below we have 2 ways to make a unique list from an list like cities( i mean to don't have douplicate names)
        Set<String> uniqueCityNames = cities.stream().collect(Collectors.toSet());
        //Set<String> uniqueCityNames = new HashSet<>(cities); // second way
        uniqueCityNames.forEach(System.out::println);

        String strCities = cities.stream()
                .collect(Collectors.joining(", "));

        //String strCities = String.join(", ", cities); //second way with join where give us the String
        System.out.println(strCities);
    }
}
