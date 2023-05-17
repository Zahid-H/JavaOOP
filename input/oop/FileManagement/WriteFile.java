package input.oop.FileManagement;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteFile {

    public static void main(String[] args) {
        String data = "Zahid Hasan juel, Dhaka Bangladesh, SQA Engineer";
        try {
            FileWriter output = new FileWriter("data3.txt");
            output.write(data);
            System.out.println("Successfully written in the file");
            output.close();

        } catch (IOException e) {
            System.out.println(e);
            System.out.println("File wtrining error");
        }

    }
}