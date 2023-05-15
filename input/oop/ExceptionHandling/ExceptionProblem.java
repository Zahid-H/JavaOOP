package input.oop.ExceptionHandling;

import java.util.*;

public class ExceptionProblem {
    public static void main(String[] args) {

        int count = 1;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a Number1: ");
                int num1 = input.nextInt();
                System.out.println("Enter a Number2: ");
                int num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println("Number 1: " + num1 + " + " + "Number 2: " + num2 + " = " + result);
                count = 2;
            } catch (Exception e) {
                System.out.println("Excention" + e);
                System.out.println("ERROR Enter valid Integer");
            }

        } while (count == 1);

    }
}