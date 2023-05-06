package input.oop;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Addition:" + cal.doAddition(5, 5));
        System.out.println("Subtraction:" + cal.doSubtraction(5, 2));
        System.out.println("Multiplication:" + cal.doMultiplication(3, 2));
        System.out.println("Division:" + cal.doDivision(6, 2));
        System.out.println("Remainder:" + cal.doRemainder(10, 4));

    }
}
