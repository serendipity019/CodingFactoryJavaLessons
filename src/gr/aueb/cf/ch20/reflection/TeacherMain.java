package gr.aueb.cf.ch20.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TeacherMain {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Teacher.class;
        Class<?> bClass = Class.forName("gr.aueb.cf.ch20.reflection.Teacher");

        //We can take with reflection the public constructors.
        Constructor<?>[] publicConstructors = Teacher.class.getConstructors();
        //We can take also with reflection and private constructors
        Constructor<?>[] constructorsList = aClass.getDeclaredConstructors();

        //Here we take the default constructor and with hack make it accessible
        Constructor<?> defaultCtor = aClass.getDeclaredConstructor();
        defaultCtor.setAccessible(true);
        Teacher teacher = (Teacher)  defaultCtor.newInstance();

        Constructor<?> longCtor = aClass.getConstructor((Long.class));

        Constructor<?> overloadedCtor = aClass.getConstructor(Long.class, String.class, String.class);

        //Here we take the method sayHello and put this with invoke inside the teacher where is the default constructor.
        Method sayHello = aClass.getMethod("sayHello"); // getdeclaredMethods() can we take and private methods.
        sayHello.invoke(teacher);
    }
}
