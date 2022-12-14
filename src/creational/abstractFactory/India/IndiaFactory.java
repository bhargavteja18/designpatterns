package creational.abstractFactory.India;

import creational.abstractFactory.AbstractCarFactory;
import creational.abstractFactory.Car;

public class IndiaFactory implements AbstractCarFactory {


    @Override
    public Car getCar(String carType) {
        switch (carType){
            case "Luxury":
                return new LuxuryCar();
            case "Sports":
                return new SportsCar();
            case "Budget":
                return new BudgetCar();
            default:
                throw new  IllegalArgumentException();

        }
    }
}
