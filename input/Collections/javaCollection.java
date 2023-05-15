package input.Collections;

import java.util.*;

public class javaCollection {
    public static void main(String[] args) {
        ArrayList<String> Name = new ArrayList<String>();
        Name.add("Zahid");
        Name.add("Hasan");
        Name.add("Juel");
        System.out.println(Name);
        Name.add(1, "Shakib");
        System.out.println(Name);
    }
}
