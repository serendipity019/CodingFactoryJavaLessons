package gr.aueb.cf.ch19.streams;

import java.util.List;
import java.util.Optional;

public class FindAndMatch {
    public static void main(String[] args) throws Exception {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        //First way to find and match a name from the list if exists
        // Optional is a class/container for wrapping null. Avoid NullPointException
        Optional<String> query = names.stream()
                .filter(name -> name.equals("Alice"))
                .findFirst();

        if (query.isPresent()) {
            System.out.println("Firstname: " + query.get());
        }
        //This below make the same as above.
        query.ifPresent(first -> System.out.println("Firstname: " + first));

        //Second way
        String strFirst = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElse(null);

        //This is the second way but here throws exception
        String strFirst2 = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElseThrow(() -> new Exception("Bob not exists"));
        //Match
        boolean isBobExists = names.stream()
                .anyMatch(name -> name.equals("Bob"));

        boolean allAreBob = names.stream()
                .allMatch(name -> name.equals("Bob"));

        boolean noneIsBob = names.stream()
                .noneMatch(name -> name.equals("Bob"));



     }

}


