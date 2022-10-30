package abstractFactory.Japan;

import abstractFactory.Car;

public class SportsCar implements Car {
    @Override
    public void getCar() {
        System.out.println("Sports Car");
    }
}
