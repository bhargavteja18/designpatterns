package abstractFactory.Japan;

import abstractFactory.Car;

public class LuxuryCar implements Car {
    @Override
    public void getCar() {
        System.out.println("Luxury Car");
    }
}
