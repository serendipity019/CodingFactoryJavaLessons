package gr.aueb.cf.ch13;

/**
 *Data class.
 * Encapsulation applied.
 * POJO (Plain Old Java Object
 * Java Bean
 */
public class Student {
    private static int studentsCount = 0;

      // This is static block and used if we want to make more complex static things.
      // With Scanner and so on.
//    static {
//        studentsCount = 0;
//    }

    private int id;
    private String firstname;
    private String lastname;

    //Default Constructor. We could merely let empty inside the { }.
    public Student(){
        id = 0;
        firstname = null;
        lastname = null;
        studentsCount++;
    }

    //Overloaded Costructor
    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

    // We can with right click (or Alt + Ins(number 0 with Numlock active)) -> Generate -> Getters and Setters write all these below
    // automatically.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return  firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
