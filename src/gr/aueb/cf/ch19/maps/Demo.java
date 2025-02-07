package gr.aueb.cf.ch19.maps;

import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Map<String, String> countries = Map.of("GR", "Greece", "EN", "England", "US", "United States");

        countries.forEach((k,v) -> System.out.println(k + ", " + v));

        // one use case is to used filter from Stream interface and after to print with forEach
        var filteredCountries = countries.entrySet().stream()
                .filter(e -> e.getKey().length() <= 2)
                .collect(Collectors.toSet());

        filteredCountries.forEach(System.out::println);

    }
}
