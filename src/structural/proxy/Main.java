package structural.proxy;

public class Main {

    public static void main(String[] args) throws Exception {

        Internet internet=new ProxyInternet();
        internet.connectTo("123.com");
        internet.connectTo("abc.com");

    }
}
