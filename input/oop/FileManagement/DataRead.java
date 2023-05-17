package input.oop.FileManagement;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.xml.crypto.Data;

public class DataRead {
    public static void main(String[] args) {
        char[] data = new char[100];
        try {

            FileReader r = new FileReader("data3.txt");
            r.read(data);

            System.out.println("File read sucessfully");
            System.out.println(data);
            r.close();
        } catch (IOException e) {
            System.out.println("err");
            System.out.println(e);
        }

    }
}
