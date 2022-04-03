package com.company;

class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            System.out.println("MyThreadRunnable11111");
        }
    }
}

class MyThreadRunnable2 implements  Runnable{
    @Override
    public void run(){
        for(int i=0;i<20000;i++){
            System.out.println("MyThreadRunnable2222");
        }
    }
}

public class Threading_by_implementing_Runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1,"Abhi"); // 1) Constructor with Object of class which implements Runnable interface AND Name of thread

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2,"Raut");

        gun1.start();
        gun2.start();

        System.out.println(gun1.getName()); // 2) Method
        System.out.println(gun2.getName());
        System.out.println(gun2.getId()); // 2) Method
    }
}