package input.oop.Abstraction;

interface Animal {
    void walk();

    int eyes = 2;

}

class duck implements Animal {
    public void walk() {
        System.out.println("Walks with 2 legs");
    }
}

public class OOPS {
    public static void main(String[] args) {
        duck d = new duck();
        d.walk();
    }
}
