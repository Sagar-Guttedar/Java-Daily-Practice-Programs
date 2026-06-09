package com.Exceptionn;
// Occurs when trying to access a file that does not exist.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("missingfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}*/


/*
public class FileNotFoundExceptionExample{
    public static void main(String[] args) {
        try {
            FileReader file=new FileReader("missing.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}*/

/*public class FileNotFoundExceptionExample{
    public static void main(String[] args) {
        try {
            FileReader file=new FileReader("missing.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}*/

public class FileNotFoundExceptionExample{
    public static void main(String[] args) {
        try {
            FileReader file=new FileReader("missing.txt");
        }catch (FileNotFoundException f){
            f.printStackTrace();
        }
    }
}
















