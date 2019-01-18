package binaryIO;

import java.io.*;

public class TestFileStream {

    public static void main(String[] args) throws IOException {
        try (
                //Create an output stream to the file
                FileOutputStream output = new FileOutputStream("temp.txt");) {
            //Output valuse to the file
            for (int i = 1; i <= 100; i++) {
                output.write(i);
            }
        }
        try (
                //Create an input system for the file
                FileInputStream input = new FileInputStream("temp.txt");) {
            //Read values from the file
            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        }
    }
}
