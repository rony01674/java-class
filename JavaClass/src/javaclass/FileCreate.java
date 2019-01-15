package javaclass;

import java.io.File;

public class FileCreate {

    public static void main(String[] args) throws Exception {
        File newFile = new File("my_new_file.txt");
        printFileDetails(newFile);

        //Create a new file
        boolean fileCreated = newFile.createNewFile();
        if (!fileCreated) {
            System.out.println(newFile + " could not be created.");
        }
        printFileDetails(newFile);
        //Delete the new file
        newFile.delete();
        System.out.println("After deleting the new path");

        //Recreate the file
        newFile.createNewFile();
        printFileDetails(newFile);

        //Let's tell the JVM to delete this file on exit
       // newFile.deleteOnExit();
        System.out.println("After using deleteOnExit() method: ");
    }

    public static void printFileDetails(File f) {
        System.out.println("Absulate path: " + f.getAbsolutePath());
        System.out.println("File exists: " + f.exists());
    }

}
