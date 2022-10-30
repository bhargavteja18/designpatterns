package adaptor;

public class Main {

    public static void main(String[] args) {
        Student s=new Student();
        s.setId(1);
        s.setName("bhargav");
        s.setCity("pdtr");

        EmployeeDAO dao=new EmployeeDAO();
        dao.save(empAdaptor(s));
    }

    public  static  Employee empAdaptor(Student s){
        return  new Employee(s.getId(),s.getName(),s.getCity());
    }
}
