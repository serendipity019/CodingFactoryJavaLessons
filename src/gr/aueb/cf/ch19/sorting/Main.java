package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products1 = List.of(new Product("", 12.5,10),
                new Product("", 12.5, 10)); // immutable list

        List<Product> products2 = Arrays.asList(new Product("", 12.5, 10),
        new Product("", 12.5, 10)); // Partially Immutable list

        List<Product> products3 = new ArrayList<>(List.of(new Product("Apples", 12.5, 10),
                new Product("Oranges", 12.5, 10),
                new Product("Berries", 12.5, 10),
                new Product("Apples", 11.5, 15))); //Mutable list

        products3.sort(Comparator.naturalOrder()); // Sort based on Comparable
        products3.sort(Comparator.reverseOrder()); // Sort based on Comparable

        products3.sort(Comparator.comparing(Product::getName));
        products3.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity)); // This is ascending
        products3.sort(Comparator.comparing(Product::getName).thenComparing(Product::getQuantity).thenComparing(Product::getPrice).reversed()); // With reversed we make descendig sort

        products3.sort(Comparator.comparing(Product::getName)
                .thenComparing(Product::getQuantity, Comparator.reverseOrder())); // Here the quantity will sort desceding
        products3.forEach(System.out::println);
    }
}
