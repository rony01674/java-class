package binaryIO;

import java.io.*;

public class Copy_Page691 {

    /**
     * Main method
     *
     * @param args[0] for source file
     * @param args[1] for target file
     */
    public static void main(String[] args) throws IOException {
        //Check xommand-line paraneter usage
//        if (args.length != 2) {
//            System.out.println("Usage: java Copy sourcefile targetfile");
//            System.exit(1);
//        }
//        //Check if source file exists
//        File sourceFile = new File(args[0]);
//        if (!sourceFile.exists()) {
//            System.out.println("Soure file " + args[0] + " does mot exist");
//            System.exit(2);
//        }
//
//        File targetFile = new File(args[1]);
//        if (targetFile.exists()) {
//            System.out.println("Target file " + args[1] + " already exists");
//            System.exit(3);
//        }
        try (
                //Create an input stream
                BufferedInputStream input
                = new BufferedInputStream(new FileInputStream("temp.txt"));
                //Create an output stream
                BufferedOutputStream output
                = new BufferedOutputStream(new FileOutputStream("targetFile.txt"));) {
            // Continusly read a byte from input and write it to output
            int r, numberOfBytesCopied = 0;
            while ((r = input.read()) != 1) {
                output.write((byte) r);
                numberOfBytesCopied++;
            }
            //Displat the file size
            System.out.println(numberOfBytesCopied + " bytes copied");
        }
    }
}
