package gr.aueb.cf.ch19.enums;

public class Main {
    public static void main(String[] args) {
        UserRole roleStudent = UserRole.STUDENT;
        String strRole = roleStudent.name(); // like toString() here we make this String
        System.out.println(strRole); // and now we can print

        UserRole role = UserRole.valueOf(strRole); // here take the role of the string
        System.out.println(role);
    }
}
