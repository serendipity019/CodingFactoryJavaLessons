package gr.aueb.cf.ch20.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainTeacher {

    private static final List<Teacher> teachers = List.of(
            new Teacher(1, "Alice", "W."),
            new Teacher(2, "Bob", "D."),
            new Teacher(3, "Panos", "P.")
    );

    public static void main(String[] args) {

        List<Teacher> teachers1 = getFilteredTeachers(teachers, teacher -> teacher.getId() == 2);

        //printTeachers(teachers, teacher -> teacher.printInstanceTeacher());
        printTeachers(teachers, Teacher::printInstanceTeacher);

        //printTeachers(teachers, teacher -> Teacher.printStaticTeacher(teacher));
        printTeachers(teachers,Teacher::printStaticTeacher);

        //printTeachers(teachers, teacher -> System.out.println(teacher));
        printTeachers(teachers, System.out::println);
    }

    /**
     * With this method filter the Teacher
     * @param teachers array list
     * @param filter used as lambda
     * @return new array list with the filtered elements
     */
//    public static List<Teacher> getFilteredTeachers(List<Teacher> teachers, ITeacherFilter filter) {
//        List<Teacher> teachersToReturn = new ArrayList<>();
//
//        for (Teacher teacher : teachers) {
//            if (filter.filterId(teacher)) {
//                teachersToReturn.add(teacher);
//            }
//        }
//        return teachersToReturn;
//    }

    /* We can use this instead of the method above because we don't need the ITeacherFilter interface
    * just used the Predicate<> interface with .test() method, all that give to us the Java and take also lambda */
    public static List<Teacher> getFilteredTeachers(List<Teacher> teachers, Predicate<Teacher> filter) {
        List<Teacher> teachersToReturn = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (filter.test(teacher)) {
                teachersToReturn.add(teacher);
            }
        }
        return teachersToReturn;
    }

    /* We use Consumer<> interface and the method .accept()  */
    public static void printTeachers(List<Teacher> teachers, Consumer<Teacher> consumer) {
        for (Teacher teacher : teachers) {
            consumer.accept(teacher);
        }
    }

}
