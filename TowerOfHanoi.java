package com.company;
//Time Complexity = O(2^n)
//conditions:-
//1) Only one disk can be moved at a time.
//2) Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
//3) No disk may be placed on top of a smaller disk
import java.util.Scanner;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n,String src,String helper,String dest){// here src , helper , dest will be change in every step
        if(n==1){
            System.out.println("Disk "+n+" moved from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper); //(n-1) disks moved from src to helper using dest as (helper)
        System.out.println("Disk "+n+" moved from "+src+" to "+dest); //nth moved from src to dest
        towerOfHanoi(n-1,helper,src,dest); //(n-1) disks from helper to dest using helper as (helper)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoi(n,"A","B","C");
    }
}

