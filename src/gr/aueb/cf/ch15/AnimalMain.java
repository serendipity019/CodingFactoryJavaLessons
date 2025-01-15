package gr.aueb.cf.ch15;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog(5,"Tommy",  "Golden Retriever");
        dog.makeSound();
        dog.searchForFood();

        //here call the polymorphic
        doMakeSound(dog);
    }
    //polymorphic method
    public static void doMakeSound(Animal animal) {
        animal.makeSound();
    }
}
