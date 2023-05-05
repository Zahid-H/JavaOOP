import java.util.*;

public class Alltypeinput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer:");
        int Myint = input.nextInt();
        System.out.println("Enter a float:");
        float Myfloat = input.nextFloat();
        System.out.println("Enter a Double:");
        Double Mydouble = input.nextDouble();
        System.out.println("Enter a String:");
        String myString = input.next();

        System.out.println(Myint);
        System.out.println(Myfloat);
        System.out.println(Mydouble);
        System.out.println(myString);

    }
}