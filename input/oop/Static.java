package input.oop;

class Employee {
    String name;
    static String company;

    public static void ChangeCompany() {
        company = "Dhaka IT";
    }
}

public class Static {
    public static void main(String[] args) {
        Employee.company = "Bangladesh IT";
        Employee E = new Employee();

        System.out.println(E.company);
    }
}
