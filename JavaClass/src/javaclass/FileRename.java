package javaclass;

import java.io.File;

public class FileRename {

    public static void main(String[] args) throws Exception {
        //Create a new file and rename it
        File firstFile = new File("Rony.txt");
        File secondFile = new File("Asaduzzaman.txt");

        boolean fileCreated = firstFile.createNewFile();

        if (fileCreated || firstFile.exists()) {
            printFileDetails(firstFile);
            printFileDetails(secondFile);
            boolean renameFlag = firstFile.renameTo(secondFile);
            if (!renameFlag) {
                System.out.println("Could not rename " + firstFile);
            }
            printFileDetails(firstFile);
            printFileDetails(secondFile);
        }
    }

    public static void printFileDetails(File f) {
        System.out.println("Absulate path: " + f.getAbsolutePath());
        System.out.println("File exists: " + f.exists());
    }
}
