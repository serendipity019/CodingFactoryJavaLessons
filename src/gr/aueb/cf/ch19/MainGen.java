package gr.aueb.cf.ch19;

import java.util.List;

public class MainGen {
    public static void main(String[] args) {
        NodeGen<String> strNode = new NodeGen<>();
        NodeGen<Integer> intNode = new NodeGen<>();
        var doubleNode = new NodeGen<Double>(); // var help us to not write every time NodeGen<Type>

        intNode.setItem(1);
        //String s = (String) intNode.getItem(); // Here saying to us directly at compile time that we have error.

        Integer[] intArr = {1, 2, 3, 4, 5, 6};
        String[] cities = {"Athens", "Paris", "London"};

        print(intArr);
        print(cities);
    }

    //This is generic print method
    public static <T> void print(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    //This is for read only perposes and we can't pass second parameter in this method
    public static void printGenericList(List<?> list, Object element)  {
        //list.add(element); //This can't be, the element parameter must delete.
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    /*
    In this below we can have and second parameter if this is number
     */
    public static void printNode (NodeGen<? extends Number> nodeGen) {
        System.out.println(nodeGen.getItem());
    }

    public static <T extends Number> void printBounded(List<T> list) {
        double sum = 0.0;

        for (T number : list){
            sum += number.doubleValue(); //The doubleValue can used because extends Number.
        }
    }

    //PECS(producer extends consumer super) with super make lower limit and with extends make upper limit
    public static <T> void consumerProducer(List<? super T> consumer, List<? extends T> producer) {
        for (T t : producer) {
            consumer.add(t);
        }
    }
 }
