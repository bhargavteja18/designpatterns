package factory;

public class Main {

    public static void main(String[] args) {
        Pen bluepen = PenFactory.factory("Blue");
        if(bluepen!=null)
        bluepen.write();
    }
}
