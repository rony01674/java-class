package javaclass;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToFile {

    public static void main(String[] args) throws Exception{
        String destFile = "Asaduzzaman.html";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {
            bw.append("Dhaka");
            bw.newLine();
            bw.append(" Is");
            bw.newLine();
            bw.append(" The");
            bw.newLine();
            bw.append(" Capital");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Writing Done!");
        }
    }
}
