package singleton;

public class ThreadSafeSingleton2 {

    private static ThreadSafeSingleton2 singleton;

    private ThreadSafeSingleton2(){

    }

    //The other threads won't wait  if singleton class is initialized
    public static  ThreadSafeSingleton2 getInstance(){
        if(singleton==null)
            synchronized (ThreadSafeSingleton2.class) {
            if(singleton==null)
                singleton = new ThreadSafeSingleton2();
            }

        return singleton;
    }

}
