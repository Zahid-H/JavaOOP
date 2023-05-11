package input.oop.Polymorphism;

//Writing class and object in a single java file
class pen {
    // this is called class
    String color;
    String brand;
    String type;
    int price;

    public void write() {
        System.out.println("Writing something");
    }

    // this are called methods inside class
    public void printColor() {
        System.out.println(this.color);
    }

    pen() {
        System.out.println("This is constructor");
    }
}

public class OOPS {
    // this is called object
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "Blue";
        pen1.type = "gel";
        pen1.write();
        pen p2 = new pen();
        p2.color = "Red";
        p2.type = "ball pen";
        pen1.printColor();
        p2.printColor();
    }
}
