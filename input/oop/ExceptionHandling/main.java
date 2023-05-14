package input.oop.ExceptionHandling;

public class main {
    public static void main(String[] args) {
        // System.out.print("Hi I am Exception Handling");
        int[] marks = { 97, 78, 83 };
        try {
            System.out.print(marks[5]);
        } catch (Exception exception) {
            // do something after cathing
        }
        System.out.print("Hi I am Exception Handling");
    }
}
