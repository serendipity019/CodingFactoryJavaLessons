package gr.aueb.cf.ch20.reflection;

public class Teacher {
    private Long id;
    private String firstname;
    private String lastname;

    public Teacher() {}

    public Teacher(Long id) {
        this.id = id;
    }

    public Teacher(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
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

    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String s) {
        System.out.println(s);
    }
}
