package creational.builder;



public class Main {

    public static void main(String[] args) {

        User.UserBuilder userBuilder=User.builder();
        User user = userBuilder.id(1).name("bhargav").city("pdtr").build();
        System.out.println(user);

    }
}
