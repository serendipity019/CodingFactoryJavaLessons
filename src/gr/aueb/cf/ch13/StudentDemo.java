package gr.aueb.cf.ch13;

public class StudentDemo {
    public static void main(String[] args) {
        Student alice = new Student(); // Invoke the default constructor.
        Student bob = new Student(2, "Bob", "Demetor"); // This made because we have the overloaded constructor
// This will be like below if the Student was be public
//        alice.id = 1;
//        alice.firstname = "Alice";
//        alice.lastname = "Wellington";


//        System.out.println("Id: " + alice.id);
//        System.out.println("Firstname: " + alice.firstname);
//        System.out.println("Lastname: " + alice.lastname);

// But because the Student is Private must write like below
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wellington");

        System.out.println("Id: " +alice.getId());
        System.out.println("Firstname: " +alice.getFirstname());
        System.out.println("Lastname: " +alice.getLastname());

        System.out.println("student instances count: " + Student.getStudentsCount());
    }
}
