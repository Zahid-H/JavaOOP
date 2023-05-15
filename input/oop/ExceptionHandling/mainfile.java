package input.oop.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

class Main {
    public static void findFile() throws IOException {
        File newFile = new File("text.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
}

public class mainfile {
    public static void main(String[] args) {
        // System.out.println("Findfile");
        try {
            findFile();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
