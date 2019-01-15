package javaclass;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromFile {

    public static void main(String[] args) throws Exception {
        String srcFile = "Asaduzzaman.html";
        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        String text = null;
        String lines = "";
        while ((text = br.readLine()) != null) {
            System.out.println(text);
            lines += text + " ";
        }
        System.out.println("Lines: " + lines);
        if (lines.contains("Dhakas")) {
            System.out.println("Exist");
        } else {
            System.out.println("Not Exist");
        }
    }
}
