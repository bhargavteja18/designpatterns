package singleton;

public class ThreadSafeSingleton3 {

    private static ThreadSafeSingleton3 singleton;

    //stops creation from reflection
    private ThreadSafeSingleton3() throws InstantiationException {
              if(singleton!=null)
                throw  new InstantiationException();
    }


    public static ThreadSafeSingleton3 getInstance() throws InstantiationException {
        if(singleton==null)
            synchronized (ThreadSafeSingleton3.class) {
            if(singleton==null)
                singleton = new ThreadSafeSingleton3();
            }

        return singleton;
    }

}
