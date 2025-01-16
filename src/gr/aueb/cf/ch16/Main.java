package gr.aueb.cf.ch16;

public class Main {
    public static void main(String[] args) {

        /*
         *We can't make new the Ispeakable because is interface but we can new that
         * where implement on this interface.
         */
        ISpeakable cat = new Cat("Alice");
        ISpeakable dog = new Dog("Bob");
        GenericSpeakingSchool genericSpeakingSchool1 = new GenericSpeakingSchool(cat);
        GenericSpeakingSchool genericSpeakingSchool2 = new GenericSpeakingSchool(dog);

        cat.speak();
        dog.speak();

        doSpeak(cat);
        doSpeak(dog);

        genericSpeakingSchool1.learToSpeak();
        genericSpeakingSchool2.learToSpeak();
    }

    //Polymorphic method
    public static void doSpeak(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }
}


