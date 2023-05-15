package input.oop.ExceptionHandling;

public class ExceptionDeom {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Handling exception in the code");
        } finally {
            System.out.print("Try and catch is finished");
        }
    }
}
