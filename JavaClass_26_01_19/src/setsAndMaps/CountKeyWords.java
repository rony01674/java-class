package setsAndMaps;

import java.io.File;
import java.util.Scanner;

public class CountKeyWords {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Java source file: ");
        String filename = input.nextLine();
        
        File file = new File(filename);
        if(file.exists()){
            System.out.println("The number of keywords in "+filename+" is "+countKeyWords(file));
        }else{
            System.out.println("File "+filename+" dose not exist");
        }
    }
    
    public static int countKeyWords(File file) throws Exception{
        
    }
    
}
