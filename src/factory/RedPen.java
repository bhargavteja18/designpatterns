package factory;

public class RedPen implements  Pen{
    @Override
    public void write() {
        System.out.println("Writes in Red");
    }
}
