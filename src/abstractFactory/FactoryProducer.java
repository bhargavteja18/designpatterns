package abstractFactory;

import abstractFactory.India.IndiaFactory;
import abstractFactory.Japan.JapanFactory;

public class FactoryProducer {

    public static  AbstractCarFactory getFactory(String country){

        switch (country){
            case "India":
                return new IndiaFactory();
            case "Japan":
                return new JapanFactory();
            default:
                throw new IllegalArgumentException();
        }
    }

}
