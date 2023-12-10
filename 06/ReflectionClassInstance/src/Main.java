import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Car");

        //Creating a class using the public constructor
        Constructor<?> publicConstructor = clazz.getConstructor(String.class, String.class);
        Object carInstance = publicConstructor.newInstance("Toyota", "Camry");

        //Public methods
        Method publicClazzMethod1 = clazz.getMethod("getBrand");
        Method publicClazzMethod2 = clazz.getMethod("setBrand", String.class);
        System.out.println(publicClazzMethod1.invoke(carInstance));
        publicClazzMethod2.invoke(carInstance, "Nissan");
        System.out.println(publicClazzMethod1.invoke(carInstance));

        System.out.println("\n");

        //Private methods
        Method privateClazzMethod1 = clazz.getDeclaredMethod("getModel");
        Method privateClazzMethod2 = clazz.getDeclaredMethod("setModel", String.class);
        privateClazzMethod1.setAccessible(true);
        privateClazzMethod2.setAccessible(true);
        System.out.println(privateClazzMethod1.invoke(carInstance));
        privateClazzMethod2.invoke(carInstance, "GTR");
        System.out.println(privateClazzMethod1.invoke(carInstance));

        //Creating a class using the private constructor
        Constructor<Car> privateConstructor = Car.class.getDeclaredConstructor(String.class);
        privateConstructor.setAccessible(true);
        Car privateCarInstance = privateConstructor.newInstance("T300");

        System.out.println("\n");

        //Public and private methods for class created through private constructor
        System.out.println(publicClazzMethod1.invoke(privateCarInstance));
        System.out.println(privateClazzMethod1.invoke(privateCarInstance));


    }
}
