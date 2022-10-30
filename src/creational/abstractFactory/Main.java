package creational.abstractFactory;

public class Main {

    public static void main(String[] args) {
        AbstractCarFactory indiaFactory = FactoryProducer.getFactory("India");

        Car luxuryCar = indiaFactory.getCar("Luxury");

         luxuryCar.getCar();
    }
}
