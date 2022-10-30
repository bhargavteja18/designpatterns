package creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        LazySingleton lazySingleton1=LazySingleton.getInstance();
        System.out.println(lazySingleton1.hashCode());

        LazySingleton lazySingleton2=LazySingleton.getInstance();
        System.out.println(lazySingleton2.hashCode());

        ThreadSafeSingleton3 threadSafeSingleton3=ThreadSafeSingleton3.getInstance();

        Constructor<ThreadSafeSingleton3> declaredConstructor = ThreadSafeSingleton3.class.getDeclaredConstructor();

        declaredConstructor.setAccessible(true);

        ThreadSafeSingleton3 threadSafeSingleton31 = declaredConstructor.newInstance();
    }
}
