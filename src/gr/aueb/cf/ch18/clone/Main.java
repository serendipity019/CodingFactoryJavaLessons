package gr.aueb.cf.ch18.clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        City athens = new City("Athens");
        City clonedAthens = athens.clone();

        clonedAthens.setDescription("Paris");
        System.out.println(athens);
        System.out.println(clonedAthens);

        Trainee alice = new Trainee("Alice", athens);
        Trainee clonedTrainee = alice.clone();

        clonedTrainee.setCity(new City("Serres"));

        System.out.println(alice);
        System.out.println(clonedTrainee);
    }
}
