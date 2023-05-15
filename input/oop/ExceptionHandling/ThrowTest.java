package input.oop.ExceptionHandling;

import java.util.*;

class Throw {
    public static void valid(int age) {
        if (age < 18) {
            throw new ArithmeticException("Person not eligible to vote");
        } else {
            System.out.println("Person eligible to vote");
        }
    }

}

public class ThrowTest {
    public static void main(String[] args) {
        Throw t = new Throw();
        t.valid(12);
    }

}