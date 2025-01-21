package gr.aueb.cf.ch17.abstract_class;

public class Cat extends Animal {
    public Cat(){
        super();
    }

    @Override
    public String toString() {
        return getId() + ", " + getName();
    }

    @Override
    public void speak() {
        System.out.println("niaou");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... ate all her food");
    }
}
