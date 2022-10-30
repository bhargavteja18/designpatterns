package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements  Internet{

    private Internet internet=new RealInternet();
    private List<String> bannedSites =new ArrayList<>();

     {

        bannedSites.add("abc.com");
        bannedSites.add("xyz.com");
    }

    @Override
    public void connectTo(String host) throws Exception {
         if(bannedSites.contains(host))
             throw new Exception("Access Blocked to - "+ host);

         internet.connectTo(host);
    }
}
