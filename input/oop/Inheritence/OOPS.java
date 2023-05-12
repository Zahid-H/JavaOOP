package input.oop.Inheritence;

import input.oop.Polymorphism.main;

class Shape {
    String color;

    public void area() {
        System.out.print("Displays area:\n");
    }
}

class Triagle extends Shape {

    // Inside this Triagle class there are the properties of Chape
    public void area(int l, int h) {
        System.out.println(.5 * l * h);
    }

    class EquiliteralTringle extends Triagle {
        public void area(int l, int h) {
            System.out.println(.5 * l * h);
        }
    }

    class circle extends Shape {
        public void area(int r) {
            System.out.println((3 * 4) * r * r);
        }
    }
}

public class OOPS {
    public static void main(String[] args) {
        Triagle t = new Triagle();
        t.color = "red";
        t.area();
        t.area(5, 3);
        ;
    }
}
