package com.company;
import java.io.*;
import java.io.BufferedReader; //It requires IOException
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        int b,sum;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the First no: ");
        //String input
        String s = br.readLine();
        System.out.print(s);
        //Character input
        char c = (char) (br.read());
        //Integer input
        int a = Integer.parseInt(br.readLine());
        //Float input
        float f = Float.parseFloat(br.readLine());
        //Double input
        double d = Double.parseDouble(br.readLine());
        System.out.print("Enter the First no: ");
        b = Integer.parseInt(br.readLine()); //Float.parseFloat(br.readLine());
        System.out.print("Sum: ");
        sum = a+b;
        System.out.print(sum);

        //For array input
        StringTokenizer st = new StringTokenizer(br.readLine()," "); //It divides input string by the string given in/
        int[] arr = new int [3];                                             // double codes here is space" "
        for(int i=0;i<3;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
    }
}
