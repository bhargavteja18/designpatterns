package prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Location l=new Location();
        l.setArea("abc");
        l.setCity("kdp");
        l.setState("AP");

        Employee e=new Employee();
        e.setId(1);
        e.setName("bhargav");
        e.setLocation(l);
        System.out.println(e);

        Employee e2= (Employee) e.clone();
        e2.setId(2);
        e2.setName("Teja");

        System.out.println(e2);

    }
}
