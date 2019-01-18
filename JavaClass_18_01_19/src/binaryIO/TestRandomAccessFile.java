package binaryIO;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {

    public static void main(String[] args) throws IOException {
        try (//Create a random access file
                RandomAccessFile inout = new RandomAccessFile("inout.txt", "rw");) 
        {
            //Clear the file to destroy the old content if exists
            inout.setLength(0);
            //Write new integers to the file
            for (int i = 0; i < 200; i++) {
                inout.write(i);
            }
            //Display the current length of the file
            System.out.println("Current file length is "+inout.length());
            
            //Retrive the first number
            inout.seek(0);
            System.out.println("The first number is "+inout.readInt());
            
            //Retrive the second number
            inout.seek(1*4);//Move the file pointer to the second number
            System.out.println("The second");
        }
    }
}
