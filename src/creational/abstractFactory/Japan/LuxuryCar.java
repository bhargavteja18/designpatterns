package creational.abstractFactory.Japan;

import creational.abstractFactory.Car;

public class LuxuryCar implements Car {
    @Override
    public void getCar() {
        System.out.println("Luxury Car");
    }
}
