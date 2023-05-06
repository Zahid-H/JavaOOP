package input.oop;

public class student {
    String name, gender, dept;
    int id;

    // This is method
    void displayInfo() {
        System.out.println("Name: " + name + "\n id: " + id + "\nDept: " + dept + "\ngender: " + gender);
    }

    void setInfo(int id, String n, String d, String g) {

        this.id = id;
        name = n;
        dept = d;
        gender = g;
        System.out.println("Name: " + n + "\n id: " + id + "\nDept: " + d + "\ngender: " + g);
    }
}
