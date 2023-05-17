package input.oop.FileManagement;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Filedelete {
    public static void main(String[] args) {
        try {
            File d = new File("data1.txt");
            if (d.delete()) {
                System.out.println("File deleted sucessfully");
            }
        } catch (Exception e) {
            System.out.println("Couldn't delete File");
        }
    }
}