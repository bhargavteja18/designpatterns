package creational.singleton;

public class ThreadSafeSingleton1 {

    private static ThreadSafeSingleton1 singleton;

    private ThreadSafeSingleton1(){

    }

    //The other threads has to wait even if creational.singleton class is initialized because synchronization over method
    public static synchronized  ThreadSafeSingleton1 getInstance(){
        if(singleton==null)
            singleton=new ThreadSafeSingleton1();

        return singleton;
    }

}
