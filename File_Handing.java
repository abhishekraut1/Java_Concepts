package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handing {
    public static void main(String[] args){
       // Code to create a new File
//        try {
//            File file = new File("C:\\Users\\abhis\\Documents\\abhishek.txt");
//            file.createNewFile();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //Code to write to a File
//        try {
//            FileWriter fileWriter = new FileWriter("C:\\Users\\abhis\\Documents\\abhishek.txt");
//            fileWriter.write("My name is Abhishek\nI am studying in 2nd Year CSE");
//            fileWriter.close(); //IMP
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //Code to read to a File
//        File file = new File("C:\\Users\\abhis\\Documents\\abhishek.txt");
//        try {
//            Scanner sc = new Scanner(file);
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//            sc.close(); //IMP
//        } catch(FileNotFoundException e){
//            e.printStackTrace();
//        }

        //Code to read to a File
        File file = new File("C:\\Users\\abhis\\Documents\\abhishek.txt");
        if(file.delete()){
            System.out.println("You have Deleted "+file);
        }else {
            System.out.println("Some problem is occurred while deleting the file");
        }
    }
}
