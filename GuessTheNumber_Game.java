package com.company;

import java.util.Random;
import java.util.Scanner;
class Game1 {
    Random r = new Random();
    public int guessNo;
    public int noOfAttempts=0;
    public Game1() {
        guessNo = r.nextInt(100);
    }
    public int play() {
        noOfAttempts++;
        Scanner sc = new Scanner(System.in);
        int enteredNo = sc.nextInt();
        if(enteredNo==guessNo) {
            System.out.println("You Win");
            System.out.println("You guessed it in "+noOfAttempts+" attempts");
            return enteredNo;
        }
        else if(enteredNo>guessNo) {
            System.out.println("Entered no is greater");
            return play();
        }
        else {
            System.out.println("Entered no is Lower");
            return play();
        }
    }
}
public class GuessTheNumber_Game {
    public static void main(String[] args) {
        Game1 g = new Game1();
        System.out.println("Enter the number: ");
        g.play();
    }
}
