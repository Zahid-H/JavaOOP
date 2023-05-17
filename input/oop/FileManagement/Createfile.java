package input.oop.FileManagement;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Createfile {
    public static void main(String[] args) {
        File myfile = new File("E:\\JavaOOP\\input\\oop\\FileManagement\\data2.txt");
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
