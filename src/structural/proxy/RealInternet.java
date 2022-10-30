package structural.proxy;

public class RealInternet implements  Internet{
    @Override
    public void connectTo(String host) throws Exception {
        System.out.println("connected to - "+host);
    }
}
