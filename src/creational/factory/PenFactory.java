package creational.factory;

public class PenFactory {

    static Pen factory(String color){

        switch(color){
            case "Blue":
                return  new BluePen();
            case "Black":
                return  new BlackPen();
            case "Red":
                return  new RedPen();
            default:
                return null;


        }
    }
}
