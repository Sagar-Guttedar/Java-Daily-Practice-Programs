package com.Exceptionn;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            FileReader fr = new FileReader(file);
        } catch (IOException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}*/
/*
public class IOExceptionExample{
    public static void main(String[] args) {
        try {
            File file=new File("nonExisting.txt");
            FileReader fr=new FileReader(file);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
*/


/*public class IOExceptionExample{
    public static void main(String[] args) {
        try {
            File file=new File("file.java");
            FileReader fr=new FileReader(file);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}*/


public class IOExceptionExample{
    public static void main(String[] args) {
        try {
            File file=new File("file.java");
            FileReader f=new FileReader(file);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

