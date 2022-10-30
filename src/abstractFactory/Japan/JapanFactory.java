package abstractFactory.Japan;

import abstractFactory.AbstractCarFactory;
import abstractFactory.Car;
import abstractFactory.India.BudgetCar;
import abstractFactory.India.LuxuryCar;
import abstractFactory.India.SportsCar;

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
