public class TestEmployee {

    public static void main(String args[]) {

        Employee employee1 = new Employee("Albert", "Einstein", 305);
        Employee employee2 = new Employee("Homer", "Simpson", "Software Engineer", "IT", 432);
        
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}