package abstractFactory.Japan;

import abstractFactory.Car;

public class BudgetCar implements Car {
    @Override
    public void getCar() {
        System.out.println("Budget Car");
    }
}