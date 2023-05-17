package input.oop.FileManagement;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File myfile = new File("data2.txt");
        try {
            if (myfile.createNewFile()) {
                System.out.println("file created sussecfully");
            } else {
                System.out.println("file creation Error");
            }
        } catch (IOException e) {

            System.out.println(e);

        }

    }
}
