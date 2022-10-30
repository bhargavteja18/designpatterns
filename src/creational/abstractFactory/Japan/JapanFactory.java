package creational.abstractFactory.Japan;

import creational.abstractFactory.AbstractCarFactory;
import creational.abstractFactory.Car;
import creational.abstractFactory.India.BudgetCar;
import creational.abstractFactory.India.LuxuryCar;
import creational.abstractFactory.India.SportsCar;

public class JapanFactory implements AbstractCarFactory {


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
