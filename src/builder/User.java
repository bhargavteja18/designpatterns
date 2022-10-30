package builder;

public class User {

    private Integer id;
    private String name;
    private String city;

    public  static UserBuilder builder(){
        return new UserBuilder();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static class   UserBuilder{
        private  User user=new User();

        public UserBuilder id(Integer id){
            user.setId(id);
            return this;
        }
        public UserBuilder name(String name){
            user.setName(name);
            return this;
        }
        public UserBuilder city(String city){
            user.setCity(city);
            return this;
        }
        public User build(){
            return this.user;
        }
    }
}
