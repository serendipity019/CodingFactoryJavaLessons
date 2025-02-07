package gr.aueb.cf.ch19.streams;

import java.util.List;

public class ReduceMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Product> products = List.of(new Product("Apples", 10.5, 45 ),
                new Product("Oranges", 8.5, 50 ),
                new Product("Mango", 18.5, 5 ),
                new Product("strawberries", 12.4, 30 ),
                new Product("Oranges", 10.5, 30 ));

        int totalSum1 = numbers.stream().reduce(0, (sum, n) -> sum + n);
        int totalSum2 = numbers.stream().reduce(0,Integer::sum); // second way to make sum

        int sumOfQuantities = products.stream()
                .map(Product::getQuantity)
                .reduce(0, Integer::sum);

        //parallel cpu accumulation
        int totalSum3 = numbers.parallelStream().reduce(0, Integer::sum, Integer::sum);
        int totalSum4 = numbers.parallelStream().reduce(0, Integer::sum); // We can write and like this the second Integer implied.

    }
}
