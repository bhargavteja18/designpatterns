package factory;

public class BluePen implements  Pen{
    @Override
    public void write() {
        System.out.println("Writes in Blue");
    }
}
