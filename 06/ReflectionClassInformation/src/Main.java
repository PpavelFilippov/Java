import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class Main {
    public static void main(String[] args) {
        String exampleClass = "Volkswagen Jetta 1.6";
        printClassInfo(exampleClass.getClass());
    }
    public static void printClassInfo(Class<?> classExample) {
        System.out.println("Class: " + classExample);

        System.out.println("Superclass: " + classExample.getSuperclass());

        int modifiers = classExample.getModifiers();
        System.out.println("Modifiers: " + Modifier.toString(modifiers));

        System.out.println("Fields:");
        Field[] fields = classExample.getDeclaredFields();
        if (classExample.getDeclaredFields().length == 0)
            System.out.println("    Class dont have fields!");
        else for (Field field : fields)
            System.out.println("    Type: " + field.getType() + " Name: " + field.getName());

        System.out.println("Constructors: ");
        Constructor<?>[] constructors = classExample.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors)
            System.out.println("    " + constructor.toString());

        System.out.println("Methods:");
        Method[] methods = classExample.getDeclaredMethods();
        if (methods.length == 0)
            System.out.println("Class dont have methods!");
        else for (Method method : methods)
            System.out.println("    " + method.toString());


        System.out.println("Interfaces:");
        Class<?>[] interfaces = classExample.getInterfaces();
        if (interfaces.length == 0)
            System.out.println("    Class dont provide interfaces!");
        else for (Class<?> classInterface : interfaces)
            System.out.println("    " + classInterface.getName());


        System.out.println("Nested classes:");
        Class<?>[] nestedClasses = classExample.getDeclaredClasses();
        if (nestedClasses.length == 0)
            System.out.println("    Class dont have nested classes!");
        else {
            for (Class<?> nestedClass : nestedClasses)
                System.out.println("    " + nestedClass.toString());
        }

        System.out.println("Annotations:");
        Annotation[] annotations = classExample.getDeclaredAnnotations();
        if (annotations.length == 0)
            System.out.println("    Class dont have annotations!");
        else for (Annotation annotation : annotations)
                System.out.println("    " + annotation.toString());
    }
}
