package gr.aueb.cf.ch15;

public class Animal {
    private String name;
    private int age;

    public Animal() {

    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic sound.");
    }

    public void searchForFood(){
        System.out.println("Searches for food.");
    }


}
